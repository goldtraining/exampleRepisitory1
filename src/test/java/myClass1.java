import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class myClass1 {
	
	
  @Test
  public void Test01() throws InterruptedException, MalformedURLException {
	  
	  DesiredCapabilities chromeDC = DesiredCapabilities.chrome();
	  
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"), chromeDC);
	  
	  driver.get("http://atidcollege.co.il/");
	  Thread.sleep(4000);
	  driver.quit();	
	  System.out.println("Test01 from class 1 Completed successfully");
  }
  
  
}
