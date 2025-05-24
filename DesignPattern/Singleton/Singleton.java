package DesignPattern.Singleton;

public class Singleton {

    // Step 1: private static instance of same class
    private static Singleton instance;

    // Step 2: private constructor
    private Singleton() {}

    // Step 3: public static method to return the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // lazy initialization
        }
        return instance;
    }
}
