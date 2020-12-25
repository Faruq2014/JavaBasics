package constructor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumConstructor {

	public static void main(String[] args) throws InterruptedException {
		Login l= new Login(null);
		l.Chrome_launch();
		l.quiteMethod();
		
		     
	}

}



class Login {
	
	WebDriver driver;  // instance variable
	
	public Login(	WebDriver driver) {
       this.driver= driver;	 // Initialize by constructor so we can use same driver for different page
}
	
	public  void Chrome_launch() throws InterruptedException  {
	  
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver=new ChromeDriver();	
		
		driver.get("https:www.facebook.com");
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().refresh();
		}
	void quiteMethod(){
		driver.quit();
	}
	
}
	
	
	
