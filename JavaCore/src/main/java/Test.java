public class Test {

    public static void main(String[] args) {
        method("P", "D");
        method("am", "am");
        method("am", "D");
        method("P", "am");
    }

    private static void method(String str1, String str2) {
        if (str1.equalsIgnoreCase("am") && str2.equalsIgnoreCase("am")) {
            System.out.println("Am" + " v. " + "Am");
        } else if (str1.equalsIgnoreCase("am")) {
            System.out.println("Am" + " v. " + str2);
        } else if (str2.equalsIgnoreCase("am")) {
            System.out.println(str1 + " v. " + "Am");
        }
    }
}
