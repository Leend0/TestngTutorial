package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

    @Test(priority = 1)
    void setUp(){
        System.out.println("Opening browser");
    }

    @Test(priority = 2)
    void searchCustomer(){
        System.out.println("Search customer test");
        //Assert.fail();
    }

    @Test(priority = 3)
    void addCustomer(){
        System.out.println("Add customer test");
    }

    @Test(priority = 4)
    void tearDown(){
        System.out.println("Closing browser");
    }

}
