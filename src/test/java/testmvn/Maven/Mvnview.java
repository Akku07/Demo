package testmvn.Maven;

import org.testng.annotations.Test;

public class Mvnview {
	@Test(priority=0)
	  public void ReadXX() {
		  System.out.println("READXX Data");
	  }
	 @Test(priority=2)
	  public void displayXX() {
		  System.out.println("DISPLAYXX Data");
	  }
}
