package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import task.Factorial;

public class NewTest {
 
  @Test
  public void first() {
	  Factorial f=new Factorial();
	  int a=4;
	  int actual=f.fact(a);
	  Assert.assertEquals(actual,24 );
  }
  
  @Test
  public void second(){
	  Factorial se=new Factorial();
	  int a=0;
	  int actual=se.fact(a);
	  Assert.assertEquals(actual, 1);
  }

 
}
