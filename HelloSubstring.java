public class HelloSubstring {
    public static void main(String[] args) {
        if (args.length > 0) {
            String result = "";

            for (String name : args) {
                result += name + ", ";
            }

            // remove last ", "
            result = result.substring(0, result.length() - 2);

            System.out.println("Hello " + result + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
