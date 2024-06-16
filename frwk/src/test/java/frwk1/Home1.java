package frwk1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Home1 {
	
	WebDriver driver=null;
	
	@BeforeClass
	public void beforeClass()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void f() {
		System.out.println("Home ------ June2024");
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	POMHome home=new POMHome(driver);
	home.myHome("Pawal");
	home.myHome("Satish");
		
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
