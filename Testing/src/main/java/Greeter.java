public class Greeter {
    public static String greeter(final String name) {
        if (name == null){
            return "Hello, anonymous";
        }
        return "Hello, " + name;
    }
}
