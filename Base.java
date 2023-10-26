package Screenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public static WebDriver driver = null;
@BeforeMethod
public void setUp() {
	driver = new ChromeDriver();
}
@AfterMethod
public void tearDown() {
	driver.quit();
}
}
