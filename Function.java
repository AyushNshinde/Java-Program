public class Function {
    
    // Function to add two numbers
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int result = addNumbers(5, 10);  // Calling the function
        System.out.println("Sum = " + result);
    }
    
}

