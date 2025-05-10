public class verloadingExample {

    // Method with one parameter
    public void display(int number) {
        System.out.println("Number: " + number);
    }

    // Overloaded method with two parameters
    public void display(int number, String message) {
        System.out.println("Number: " + number + ", Message: " + message);
    }

    // Overloaded method with a different parameter type
    public void display(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        overloadingExample example = new overloadingExample();

        // Calling the first method
        example.display(10);

        // Calling the second method
        example.display(20, "Hello");

        // Calling the third method
        example.display("Overloading in Java");
    }
}