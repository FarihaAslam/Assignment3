package ObjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	WebDriver driver;
	public Register(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	 //Initialize Account tab
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/i")
    public WebElement AccountLink;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    public WebElement RegisterLink;
	
	// Initialize Registration form fields
	@FindBy(id="input-firstname")
	public WebElement Fname;
	@FindBy(id="input-lastname")
	public WebElement Lname;
	@FindBy(id="input-email")
	public WebElement Email;
	@FindBy(id="input-telephone")
	public WebElement Telephone;
	@FindBy(id="input-password")
	public WebElement Pwd;
	@FindBy(id="input-confirm")
	public WebElement ConfirmPwd;
	@FindBy(xpath="//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
	public WebElement SusbscribeYes;
	@FindBy(xpath="//*[@id=\"content\"]/form/div/div/input[2]")
	public WebElement ContinueButton;
	
	
	public void register()
	{
		AccountLink.click();
		RegisterLink.click();
		Fname.sendKeys("a");
		Lname.sendKeys("b");
		Email.sendKeys("ao@bo.com");
		Telephone.sendKeys("012345678926");
		Pwd.sendKeys("pass");
		ConfirmPwd.sendKeys("pass");
		boolean SubscribeNo;
		SubscribeNo = driver.findElements(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).size() != 0;
		if(SubscribeNo)
	    {
		SusbscribeYes.click();
	    }
		WebElement Checkbox = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
		Checkbox.click();
		ContinueButton.click();
		}

}
