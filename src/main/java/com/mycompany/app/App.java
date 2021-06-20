package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Helloo World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
    
    public static int calc(int a, int b) {
        int result1 = a * b;
        return  result1;
    }
    
    private final String getMessage() {
        return message;
    }

}
