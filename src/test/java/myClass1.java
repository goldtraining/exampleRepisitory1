import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myClass1 {
	
	
  @Test
  public void Test01() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://atidcollege.co.il/");
	  Thread.sleep(4000);
	  driver.quit();	
	  System.out.println("Test01 from class 1 Completed successfully");
  }
  
  
}
