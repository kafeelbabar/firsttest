import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirst {
	static WebDriver driver;

	public void launchBrowser() { 
	System.setProperty("webdriver.chrome.driver", "/Users/kafeelbabar/Downloads/chromedriver");
	driver=new ChromeDriver();
	driver.get("https://in.yahoo.com/?p=us");
	}

	public static void main(String[] args) {
		
		SeleniumFirst obj = new SeleniumFirst();
		obj.launchBrowser();
	    driver.findElement(By.tagName("a"));
	    driver.quit();
	}
}
