public class HelloEnhanced {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.print("Hello ");
            
            int count = 0;
            for (String name : args) {
                System.out.print(name);
                count++;
                
                if (count < args.length) {
                    System.out.print(", ");
                }
            }
            
            System.out.println("!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
