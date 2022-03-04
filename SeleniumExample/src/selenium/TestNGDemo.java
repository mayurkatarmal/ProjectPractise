package selenium;

import org.testng.annotations.Test;

public class TestNGDemo {
  @Test(priority=1)
  public void Login() {
	  System.out.println("this is login");
  }
  @Test(priority=2)
  public void Admin() {
	  System.out.println("this is Admin");
  }
  
  
  
  @Test(priority=3)
  public void Logout() {
	  System.out.println("this is logout");
  }
 
}
