class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Dog d = new Dog();       // Dog object
        Animal a = new Animal(); // Animal object
        Animal ad = new Dog();   // Runtime polymorphism

        d.sound();   // Dog barks
        a.sound();   // Animal makes sound
        ad.sound();  // Dog barks (because object is Dog)
    }
}
