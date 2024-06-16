package frwk1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMDev {
//test
	public WebDriver driver = null;
	public String dev = "//a[@name='Development']";

	public POMDev(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDev() {
		WebElement dev1 = null;
		dev1 = driver.findElement(By.xpath(dev));
		return dev1;
	}

	public void clickDev() {
		driver.manage().window().maximize();
		getDev().click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("DONE");

	}

}
