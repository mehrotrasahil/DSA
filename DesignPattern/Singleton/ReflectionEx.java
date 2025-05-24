package DesignPattern.Singleton;

import java.lang.reflect.Constructor;

public class ReflectionEx {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton2.equals(singleton1));

        /* *
         * To break the singleton class because it solely depends on the 
         * private constructor So to access the private constructor we can use 
         * reflection which basically gives the power to access the private constructors,
         * methods or fields at runtime
         */

         try{
            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);  // Bypass private access
            Singleton instance2 = constructor.newInstance(); // Creates a new object!

            System.out.println(singleton2.equals(instance2));
         }catch(Exception e){
            throw new RuntimeException(e.getMessage());
         }

    }
    
}
