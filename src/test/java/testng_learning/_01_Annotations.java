package testng_learning;

import org.testng.annotations.*;

public class _01_Annotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This is BeforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("This is AfterSuite");
    }

    @BeforeClass
    public void beforeClass(){   // i could use this for logs
        System.out.println("This is the BeforeClass");
    }

    @AfterClass
    public void afterClass(){   // this would be good for a report
        System.out.println("This is the AfterClass");
    }

    @BeforeMethod
    public void beforeMethod(){   // obv for webdriver stuff lol
        System.out.println("This is the BeforeMethod");
    }

    @AfterMethod
    public void afterMethod(){   // webdriver teardown stuff
        System.out.println("This is the AfterMethod");
    }

    @Test
    public void test1(){
        System.out.println("This is Test1");
    }

    @Test
    public void test2(){
        System.out.println("This is Test2");
    }




}
