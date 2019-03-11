package my12;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class a {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
//		WebDriver driver;
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\User Data");
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		capabilities.setCapability(ChromeOptions.CAPABILITY,option);
//		driver = new RemoteWebDriver(new URL("http://169.254.172.213:5555/wd/hub"),capabilities);
//	    driver.get("http://www.baidu.com");
//		driver.findElement(By.id("kw")).sendKeys("selenium");
		
		WebDriver driver;
		ProfilesIni allProfiles = new ProfilesIni();
		FirefoxProfile profile = allProfiles.getProfile("default");
		DesiredCapabilities Capabilities = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(new URL("http://169.254.172.213:1111/wd/hub"),Capabilities);
		driver.get("http://www.baidu.com");
		driver.findElement(By.id("kw")).sendKeys("selenium");
		
		
		
		
		
	}

}
