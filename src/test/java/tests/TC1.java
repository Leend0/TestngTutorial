package tests;

import org.testng.annotations.*;


public class TC1 {

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
    void test1(){
        System.out.println("This is test1");
    }

    @Test
    void test2(){
        System.out.println("This is test2");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("Execute before Test");
    }

    @AfterTest
    void afterTest(){
        System.out.println("Execute after test");
    }
}
