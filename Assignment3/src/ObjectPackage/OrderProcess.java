package ObjectPackage;

import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class OrderProcess {
	
	WebDriver driver;
	public OrderProcess(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

@FindBy(xpath="//*[@id=\"content\"]/div/div/a")
public WebElement ConituneAfterRegister;
		
@FindBy(name="search")
public WebElement searchbox;

@FindBy(xpath="//*[@id=\"search\"]/span/button")
public WebElement searchbutton;

@FindBy(xpath="//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]/i")
public WebElement AddtoCartIcon;

@FindBy(id="button-cart")
public WebElement AddtoCartButton;

@FindBy(xpath="//*[@id=\"cart\"]/button")
public WebElement ItemButton;

@FindBy(xpath="//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]/strong")
public WebElement CheckoutLink;

@FindBy(xpath="//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label/input")
public WebElement NewAddressRB;

//ADD ADDRESS DETAILS

@FindBy(id="input-payment-firstname")
public WebElement Fname;
@FindBy(id="input-payment-lastname")
public WebElement Lname;
@FindBy(id="input-payment-company")
public WebElement Comp;
@FindBy(id="input-payment-address-1")
public WebElement Add1;
@FindBy(id="input-payment-address-2")
public WebElement Add2;
@FindBy(id="input-payment-city")
public WebElement City;
@FindBy(id="input-payment-postcode")
public WebElement PC;


@FindBy(id="button-payment-address")
public WebElement ContinueButton1;
@FindBy(id="button-shipping-address")
public WebElement ContinueButton2;

@FindBy(xpath="//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")
public WebElement DeliveryMethod;

@FindBy(id="button-shipping-method")
public WebElement ContinueButton3;

@FindBy(xpath="//*[@id=\"collapse-payment-method\"]/div/p[3]/textarea")
public WebElement PaymentMethod;

@FindBy(id="button-payment-method")
public WebElement ContinueButton4;

@FindBy(id="button-confirm")
public WebElement ContinueButton5;

//@FindBy(xpath="//*[@id=\"content\"]/div/div/a")
//public WebElement ContinueButton6;

public void Search()
{
    ConituneAfterRegister.click();
	searchbox.sendKeys("hp lp3065");
	searchbutton.click();
	AddtoCartIcon.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	AddtoCartButton.click();
	ItemButton.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	CheckoutLink.click();
	boolean AddressExistRB;
	AddressExistRB = driver.findElements(By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[3]/label/input")).size() != 0;
		 if(AddressExistRB)
		  {
			 NewAddressRB.click();
		  }
	Fname.sendKeys("Fariha");
	Lname.sendKeys("Aslam");
	Comp.sendKeys("ABC Company");
	Add1.sendKeys("Dummy Address 1");
	Add2.sendKeys("Dummy Address 2");
	City.sendKeys("Austria");
	PC.sendKeys("75300");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Select Country=new Select(driver.findElement(By.id("input-payment-country")));
    Country.selectByVisibleText("Australia");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    Select StateSelected = new Select(driver.findElement(By.id("input-payment-zone")));
	StateSelected.selectByVisibleText("Victoria");
	ContinueButton1.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Select DeliveryExistingAddress = new Select(driver.findElement(By.xpath("//*[@id=\"shipping-existing\"]/select")));
	DeliveryExistingAddress.getFirstSelectedOption();
	ContinueButton2.click();
	DeliveryMethod.sendKeys("This is delivery method description");
	ContinueButton3.click();
	PaymentMethod.sendKeys("\nThis is payment method description");
	WebElement Checkbox = driver.findElement(By.xpath("//*[@id=\"collapse-payment-method\"]/div/div[2]/div/input[1]"));
	Checkbox.click();
	ContinueButton4.click();
	ContinueButton5.click();
	//ContinueButton6.click();
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	 }
	 
}

