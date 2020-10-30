package jsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.actitime.pom.LoginPage;

public class MainMethodClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		LoginPage l=new LoginPage(driver);		
		PageFactory.initElements(driver, l);
		l.setLogin("admin", "manager");
	}
}
