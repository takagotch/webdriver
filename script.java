import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class script{
  
  public static void main(String[] srgs){
    WebDriver driver = new FirefoxDriver();
    driver.get("http://ex.selenium.jp/reserveApp");
    driver.findElement(By.id("fuestname")).sendKeys("USER");
    driver.findElement(By.id("goto_next")).click();
    driver.quit();
  }
}

