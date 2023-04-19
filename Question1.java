package day9;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Question1 {
 int c;
  @Test(dataProvider = "dp")
  public void ADD(Integer n, Integer m) 
  {
   c=m+n;
   System.out.println("Sum="+c);
  }
  @Test(dataProvider = "dp")
  public void SUB(Integer n, Integer m) 
  {
   c=m-n;
   System.out.println("SUBT="+c);
  }
  @Test(dataProvider = "dp")
  public void MUL(Integer n, Integer m) 
  {
   c=m*n;
   System.out.println("MUL="+c);
  }
  @Test(dataProvider = "dp")
  public void DIV(Integer n, Integer m) 
  {
   c=m/n;
   System.out.println("DIV="+c);
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, 7 },
      new Object[] { 2, 9 },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}