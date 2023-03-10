package asd;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class W {

	public static void main(String[] args) throws Exception {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RZ8T212XWCX");
		dc.setCapability("appPackage","com.sec.android.app.popupcalculator");
		dc.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
		dc.setCapability("noRest",true);
		URL url =new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver dr=new AndroidDriver(url,dc);
		dr.findElement(By.xpath("//android.widget.Button[@content-desc=\"8\"]")).click();
		dr.findElement(By.xpath("//android.widget.Button[@content-desc=\"Plus\"]")).click();
		dr.findElement(By.xpath("//android.widget.Button[@content-desc=\"2\"]")).click();
		dr.findElement(By.xpath("//android.widget.Button[@content-desc=\"Equal\"]")).click();
	    String z=dr.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula")).getText();
		System.out.println(z);
        dr.quit();
	}

}
