Steam: the Next-Gen smoky and experimental Language
===================================================


Sample SBT project that process an Antlr grammar, generates the corresponding lexer and parser
and add generated java folder to the source folder list.


Resources
===================================================

* [ANTLR](http://www.antlr.org)
* [GIT branching model](http://nvie.com/posts/a-successful-git-branching-model/)
* [Test driven development with ANTLR](http://www.antlr.org/wiki/display/ANTLR3/Test-Driven+Development+with+ANTLR)


History
===================================================

The language diary

## Day one (tag 'day-one')

* Project setup
* Simplify starting grammar
* Add simple specs test
* tag the day one code

     git tag -a day-one -m "End of Day One"

## Day two (tag 'day-two')

* Add qualified identifier

        qualifiedIdentifier returns [QualifiedIdentifier result]
        @init { List<String> path = new ArrayList<String> (); } :
          id=Identifier { path.add(id.getText()); } (':' id=Identifier { path.add(id.getText()); })*
        {
          log.debug("qualifiedIdentifier from "+path);
          result = new QualifiedIdentifier(path.toArray(new String[path.size()]));
        };

* Modify grammar, 'require' now takes a qualified identifier
* Fix tests according to this new behavior
* Add logger to the parser:

        @parser::members {
            org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(getClass());
        }

* Push created tags in the remote repository (github)

        git push --tags


