package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAnnotations {

    @BeforeMethod
    public void beforeMethods(){
        System.out.println("I am before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am after method");
    }

    @Test(groups = "regression")
    public void aFirstTestCase(){
        System.out.println("I am the first test case");
    }

    @Test
    public void bSecondTestCase(){
        System.out.println("I am the second test case");
    }

    @Test
    public void cThirdTestCase(){
        System.out.println("I am the third test case");
    }

}
