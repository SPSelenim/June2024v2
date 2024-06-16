package Search1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import frwk1.POMDev;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Dev {
	WebDriver driver = null;

	@BeforeClass
	public void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void dev() {
		System.out.println("dev ------ June2024");
		driver.get("file:///D:/SeleniumAutomation/05DemoApps/demo.html");
		POMDev dev = new POMDev(driver);
		dev.clickDev();

		System.out.println("DONE");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();

	}
}
