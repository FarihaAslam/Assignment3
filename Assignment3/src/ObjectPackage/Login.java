package ObjectPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
@FindBy(name="email")
public WebElement emailid;

@FindBy(name="password")
public WebElement password;

@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
public WebElement LoginButton;

public void login(String ID, String PWD)
{
	emailid.sendKeys(ID);
	password.sendKeys(PWD);
	LoginButton.click();
}
}