package util;

public class GlobMatcher {
    private String pattern;
    private String text;

    public GlobMatcher(String pattern, String text) {
        this.pattern = pattern;
        this.text = text;
    }

    private boolean matchCharacter(int patternIndex, int textIndex) {
        if (patternIndex >= pattern.length()) {
                return false;
        }

        switch(pattern.charAt(patternIndex)) {
                case '?':
                        // Match any character
                        if (textIndex >= text.length()) {
                                return false;
                        }
                        break;

                case '*':
                        // * at the end of the pattern will match anything
                        if (patternIndex + 1 >= pattern.length() || textIndex >= text.length()) {
                                return true;
                        }

                        // Probe forward to see if we can get a match
                        while (textIndex < text.length()) {
                                if (matchCharacter(patternIndex + 1, textIndex)) {
                                        return true;
                                }
                                textIndex++;
                        }

                        return false;

                default:
                        if (textIndex >= text.length()) {
                                return false;
                        }

                        String textChar = text.substring(textIndex, textIndex + 1);
                        String patternChar = pattern.substring(patternIndex, patternIndex + 1);

                        // Note the match is case insensitive
                        if (textChar.compareToIgnoreCase(patternChar) != 0) {
                                return false;
                        }
        }

        // End of pattern and text?
        if (patternIndex + 1 >= pattern.length() && textIndex + 1 >= text.length()) {
                return true;
        }

        // Go on to match the next character in the pattern
        return matchCharacter(patternIndex + 1, textIndex + 1);
    }
}
