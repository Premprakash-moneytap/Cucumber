package Functions;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import Page.Login_Page1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UI_Login1 
{
	public static void delete_login(WebDriver Driver ,String Email)
	{
		String Del_URL="https://dev.moneytap.com/engg/nodered/supportal/customer/delete/"+Email+"/dev";
		String title;
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.addArguments("start-maximized"); 
        options.addArguments("enable-automation"); 
        options.addArguments("--no-sandbox"); 
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation"); 
        options.addArguments("--disable-gpu"); 
        options.addArguments("--allow-running-insecure-content");
       
//        options.addArguments(@"user-data-dir=c:\\Users\\{username}\\AppData\\Local\\Google\\Chrome\\User Data\\");
//		IWebDriver driver = new OpenQA.Selenium.Chrome.ChromeDriver();
//        
        
        DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    	options.merge(capabilities);
        
        
//        options.setBinary("Binary path of the Chrome");
		
		
		Driver=new ChromeDriver(options);
		
		Set<Cookie> X=Driver.manage().getCookies();
		
		System.out.println(X);
		
		Driver.get(Del_URL); 
		Driver.manage().window().maximize();
		Driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		title=Driver.getTitle();
		System.out.println(title);

		//not signed in
		if(title.contains("Sign In"))
		{
			Actions act=new Actions(Driver);
			WebElement We=Driver.findElement(Login_Page1.Signin);
			act.moveToElement(We).click().perform();
		}
		

}
}
