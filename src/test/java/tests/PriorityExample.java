package tests;

import org.testng.annotations.*;

public class PriorityExample {

    @Test(priority = 0)
    void testOne(){
        System.out.println("Test1");
    }

    @Test(priority = 1)
    void testThree(){
        System.out.println("Test2");
    }

    @Test(priority = 2)
    void testFour(){
        System.out.println("Test3");
    }

    @Test(priority = 3, enabled = false)
    void testFive(){
        System.out.println("Test4");
    }
}
