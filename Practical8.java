class Practical8 {
    public static void main(String[] args) {

        System.out.println("\nEnrollment No.: 240390107011\n");

        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers.");
            return;
        }

       
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        
        int sum = num1 + num2;

        
        System.out.println("Sum = " + sum);
    }
}
