package testmvn.Maven;

import org.testng.annotations.Test;

public class MvnTest {
	@Test(priority=0)
	  public void aVIEWX() {
		  System.out.println("READX Data");
	  }
	 @Test(priority=2)
	  public void displayX() {
		  System.out.println("DISPLAYX Data");
	  }
}
