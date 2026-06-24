package org.example.singleton;

public class Singleton {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        logger1.log("first log message");
        Logger logger2 = Logger.getInstance();
        logger2.log("Second log message");
        System.out.println("are both using the same instance ? "+logger1.equals(logger2));
        System.out.println(System.identityHashCode(logger1));
        System.out.println(System.identityHashCode(logger2));
    }
}
