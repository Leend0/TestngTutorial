package tests;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void setUp(){
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void login(){
        System.out.println("Login");
    }

    @Test(priority = 3)
    void tearDown(){
        System.out.println("Closing browser");
    }
}
