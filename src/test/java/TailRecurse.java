import java.util.Map;

public class TailRecurse {

    public void loop(Map<String,String> context) {
        if(context.isEmpty())
        {
            context.put("S", "K");
        }
        else {
            loop(context);
        }
    }
}
