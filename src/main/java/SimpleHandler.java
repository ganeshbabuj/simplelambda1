import com.amazonaws.services.lambda.runtime.Context;

public class SimpleHandler {

    public String handleRequest(Object input, Context context) {
        context.getLogger().log("Input: " + input);
        return "Hello World - " + input;
    }
}
