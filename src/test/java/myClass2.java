import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myClass2 {
  @Test
  public void Test02() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://atidcollege.co.il/");
	  Thread.sleep(4000);
	  driver.quit();	
	  System.out.println("Test02 from class 2 Completed successfully");
  }
}
