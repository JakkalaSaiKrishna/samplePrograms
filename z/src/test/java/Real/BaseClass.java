package Real;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {
	AndroidDriver dr;
	@BeforeTest
	public void setCapabilities() throws Exception {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RZ8T212XWCX");
		dc.setCapability("appPackage","com.hmh.api");
		dc.setCapability("appActivity","com.hmh.api.ApiDemos");
		dc.setCapability("noRest",true);
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		dr=new AndroidDriver(url,dc);
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	}
	
	

	/*@AfterTest
	public void close() {
		dr.quit();
	}*/
}
