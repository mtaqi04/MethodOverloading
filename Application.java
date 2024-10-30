public class Application {

    // Overloaded method for adding two integers
    public void doSomething(int x, int y) {
        int result = x + y;
        if (result > 0) {
            System.out.println("The result is positive: " + result);
        } else if (result < 0) {
            System.out.println("The result is negative: " + result);
        } else {
            System.out.println("The result is zero.");
        }
    }

    // Overloaded method for concatenating two strings
    public void doSomething(String x, String y) {
        String result = x + y;
        System.out.println("Concatenated string: " + result);
    }

    // Overloaded method for adding two integers and concatenating with a string
    public void doSomething(int x, int y, String z) {
        int sum = x + y;
        String result = sum + z;
        System.out.println("Result of adding and concatenating: " + result);
    }

    // Method to call all overloaded methods
    public void start() {
        doSomething(5, 10); // Example call with integers
        doSomething("Hello, ", "World!"); // Example call with strings
        doSomething(3, 4, " is the sum."); // Example call with integers and a string
    }
}
