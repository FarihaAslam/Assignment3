package MainPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectPackage.Login;
import ObjectPackage.Logout;
import ObjectPackage.OrderProcess;
import ObjectPackage.Register;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Training\\java 7 lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// OPEN LOGIN SCREEN

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().window().maximize();
		
		//Register
		
		Register reg1 = new Register(driver);
		reg1.register();
		
		String ActualPageTitle0 = driver.getTitle();
		String ExpectedPageTitle0 = "Your Account Has Been Created!";
		if(ActualPageTitle0.contentEquals(ExpectedPageTitle0))
		{
		    System.out.println("Test Passed!");
		} else {
		    System.out.println("Test Failed");
		}
		System.out.println("Registered Successfully");
		
				
		//Order Process
				OrderProcess orderprocess = new OrderProcess(driver);
				orderprocess.Search();
				String ActualPageTitle1 = driver.getTitle();
				
				//String ExpectedPageTitle1 = "Your order has been placed!";
				String ExpectedPageTitle1 = "Your Store";
				if(ActualPageTitle1.contentEquals(ExpectedPageTitle1))
				{
				    System.out.println("Test Passed!");
				} else {
				    System.out.println("Test Failed");
				}
				System.out.println("Order Placed Successfully");
				Thread.sleep(5000);
			
		//Logout
				Logout logout1=new Logout(driver);
				logout1.logout();
				String ActualPageTitle2 = driver.getTitle();
				String ExpectedPageTitle2 = "Account Logout";
				if(ActualPageTitle2.contentEquals(ExpectedPageTitle2))
				{
				    System.out.println("Test Passed!");
				} else {
				    System.out.println("Test Failed");
				}
				System.out.println("Logout Successfully");
				
		//Login
				Login log1 = new Login(driver);
				log1.login("fari@live.com","pass123");
	}
	

}
