package ObjectPackage;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	WebDriver driver;
	public Logout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/i")
    public WebElement AccountLink;
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
    public WebElement LogoutLink;
	
	public void logout()
	{
		AccountLink.click();
		LogoutLink.click();
		}
	
	
}
