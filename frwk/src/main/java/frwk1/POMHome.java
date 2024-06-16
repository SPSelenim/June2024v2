package frwk1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class POMHome {

	public WebDriver driver=null;
public String firstName="fname";

	
	public POMHome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getFirstName()
	{
		WebElement FirstName1=null;
		FirstName1=	driver.findElement(By.id(firstName));
		return FirstName1;
	}
	public void myHome(String First)
	{
		driver.manage().window().maximize();
	getFirstName().sendKeys(First);
	
	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("DONE");

	}
	
}
