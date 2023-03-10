package asd;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Browser {
public static void main(String[] args) throws Exception {
	WebDriver driver;
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RZ8T212XWCX");
	dc.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
	dc.setCapability("chromedriverExecutable", "C:\\Users\\saija\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	URL url =new URL("http://127.0.0.1:4723/wd/hub");
	driver=new AndroidDriver(url,dc);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://fb.com");
	driver.findElement(By.id("m_login_email")).sendKeys("saikrishnayadavjakkkala");
	driver.findElement(By.id("m_login_password")).sendKeys("033614");
	driver.findElement(By.id("signup_button_area")).click();
	driver.findElement(By.className("android.widget.Button")).click();
}
}
