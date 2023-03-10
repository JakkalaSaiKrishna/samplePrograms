package Real;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC02 extends BaseClass{
	@Test(priority=2)
	public void TC02() {
		dr.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		dr.findElement(By.id("android:id/button1")).click();
		dr.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[2]")).click();
		dr.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[6]")).click();
        dr.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]")).click();
        List<WebElement> z=dr.findElements(By.className("android.widget.Button"));
        WebElement y=dr.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[2]"));
        y.click();
        dr.findElement(By.id("com.hmh.api:id/addNewButton")).click();
        SoftAssert ac=new SoftAssert();
		ac.assertSame(z, y);
		System.out.println("show button appears");
	}
}
