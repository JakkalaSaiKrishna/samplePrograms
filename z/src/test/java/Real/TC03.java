package Real;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC03 extends BaseClass {
	@Test
	public void tc03() {
		dr.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		dr.findElement(By.id("android:id/button1")).click();
		dr.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")).click();
		dr.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[1]")).click();
		dr.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[5]")).click();
		dr.findElement(By.id("com.hmh.api:id/toggle_show_title")).click();
		WebElement z=dr.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.TextView"));
	    System.out.println(z.getText());
	}
}
