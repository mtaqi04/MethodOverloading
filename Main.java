public class Main {
    public static void main(String[] args) {
        Application app = new Application();
        app.start(); // Calls all overloaded methods
        // Additional test call
        app.doSomething(-5, 3); // Test with integers to check positive/negative/zero
    }
}
