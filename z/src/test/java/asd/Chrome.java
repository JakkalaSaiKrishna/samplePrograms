package asd;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Chrome {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		d.setCapability(MobileCapabilityType.DEVICE_NAME,"RZ8T212XWCX");
		d.setCapability("appPackage","com.android.chrome");
		d.setCapability("appActivity","com.google.android.gms.common.api.GoogleApiActivity");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AndroidDriver dr=new AndroidDriver(url,d);
		

	}

}
