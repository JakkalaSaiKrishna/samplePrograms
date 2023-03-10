package asd;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PhoneCall {
public static void main(String[] args) throws Exception {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,"RZ8T212XWCX");
	dc.setCapability("appPackage","com.samsung.android.dialer");
	dc.setCapability("appActivity","com.samsung.android.dialer.DialtactsActivity");
	dc.setCapability("noRest",true);
	URL url =new URL("http://127.0.0.1:4723/wd/hub");
	AndroidDriver dr=new AndroidDriver(url,dc);
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	dr.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"9 ,W,X,Y,Z\"]")).click();
	dr.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"6,M,N,O\"]/android.widget.TextView[2]")).click();
	dr.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"4,G,H,I\"]/android.widget.TextView[1]")).click();
	dr.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"0,+\"]/android.widget.TextView[1]")).click();
	dr.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"3,D,E,F\"]/android.widget.TextView[2]")).click();
	dr.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"1Voicemail\"]/android.widget.TextView")).click();
	dr.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"6,M,N,O\"]/android.widget.TextView[2]")).click();
	dr.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"8,T,U,V\"]/android.widget.TextView[2]")).click();
	dr.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"2,A,B,C\"]/android.widget.TextView[2]")).click();
	dr.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\\\"6 ,M,N,O\\\"]/android.widget.TextView[2]")).click();
	dr.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Call button\"]/android.widget.ImageView")).click();
}
}
