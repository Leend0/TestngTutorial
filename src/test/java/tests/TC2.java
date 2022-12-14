package tests;

import org.testng.annotations.*;

public class TC2 {

    @BeforeClass
    void beforeClass(){
        System.out.println("Execute before class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("Execute after class");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Execute before every test method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("Execute after every method");
    }

    @Test
    void test3(){
        System.out.println("This is test3");
    }

    @Test
    void test4(){
        System.out.println("This is test4");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("Execute before suite");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("Execute after suite");
    }

}
