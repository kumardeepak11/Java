// Parent class
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animals make sounds");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the sound method
    @Override
    void sound() {
        System.out.println("Dogs bark");
    }
}

// Main class
public class OverridingExample {
    public static void main(String[] args) {
        // Parent class reference pointing to parent object
        Animal animal = new Animal();
        animal.sound(); // Output: Animals make sounds

        // Parent class reference pointing to child object
        Animal dog = new Dog();
        dog.sound(); // Output: Dogs bark
    }
}