package pageObjects;
import envSetup.BaseClass;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;

import java.io.IOException;
import java.net.MalformedURLException;
public class LockScreenPage extends BaseClass {

    public static By Lock_title=By.id("com.samsung.android.shealthmonitor:id/title");
    public static By Lock_alert_text=By.id("com.samsung.android.shealthmonitor:id/alert_text");
    public static By NotNowButton=By.id("com.samsung.android.shealthmonitor:id/negative_button");
    public static By setup_lock_screen_button=By.id("com.samsung.android.shealthmonitor:id/positive_button");
    public static By PIN_button=By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout");
    public static By PIN_field=By.id("com.android.settings:id/password_entry");
    public static By PIN_confirm_radio_button=By.id("com.android.settings:id/radio_btn");
    public static By Continue_OK_button=By.id("com.android.settings:id/next_button");
    public static By Done_button=By.id("com.android.settings:id/button_done");
    public static By Agree_Button=By.id("android:id/button1");

    public static By Phone_Search_field=By.id("com.sec.android.app.launcher:id/app_search_edit_text_wrapper");
    public static By app_shm=By.xpath("//android.widget.TextView[@content-desc=\"Samsung Health Monitor\"]");

    public static void LocScreenOperations() throws InterruptedException, IOException {
        driver.findElement(setup_lock_screen_button).click();
        System.out.println("Setup lock screen button clicked");
        driver.findElement(PIN_button).click();
        System.out.println("PIN field clicked");
        driver.findElement(PIN_field).sendKeys("1111");
        System.out.println("Send keys for PIN ");
        driver.findElement(PIN_confirm_radio_button).click();
        System.out.println("PIN Radion button clicked");
        driver.findElement(Continue_OK_button).click();
        System.out.println("Continue ok button clicked");
        driver.findElement(PIN_field).sendKeys("1111");
        System.out.println("Send keys for PIN ");
        driver.findElement(Continue_OK_button).click();
        System.out.println("Continue Ok button is Done");
        driver.findElement(Done_button).click();
        System.out.println("Done button is clicked ");
        driver.findElement(Agree_Button).click();
        System.out.println("Agree Button is Clicked ");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        BaseClass.HOME_Key();
        BaseClass.scrolling_down_screen();
        // opening app form search field
        driver.findElement(Phone_Search_field).click();
        Thread.sleep(2000);
        //driver.findElement(By.id("com.sec.android.app.launcher:id/app_search_edit_text_wrapper")).sendKeys("samsung health monitor ");
        Thread.sleep(2000);
        driver.findElement(app_shm).click();
        Thread.sleep(2000);



    }

}
