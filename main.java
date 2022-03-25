import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;


public class calmain {
    public static void main(String args []) throws MalformedURLException {
        DesiredCapabilities dc = new Desiredcapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, value: "988954444650444443");
        dc.setCapability(capabilityName: "platformName", value: "android");
        dc.setCapability(capabilityName: "appPackage", value: "com.android.calculator");
        dc.setCapability(capabilityName: "appActivity", value: ".Calculator");

        AndroidDriver<AndroidElement> ad = new AndroidDriver<AndroidElement>(new URL( spec "http://127.0.0.1:4723/wd/hub"),dc);

        MobileElement e1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_1");
        e1.click();

        MobileElement e2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e2.click();

        MobileElement e3 = (MobileElement) driver.findElementByAccessibilityId("minus");
        e3.click();

        MobileElement e4 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e4.click();

        MobileElement e5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        e5.click();

        MobileElement e6 = (MobileElement) driver.findElementByAccessibilityId("equals");
        e6.click();

        Assert.asserEquals(driver.findElementByID("com.android.calculator2:id/result").getText(),8)





        MobileElement e7 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_1");
        e7.click();

        MobileElement e8 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e8.click();

        MobileElement e9 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e9.click();

        MobileElement e10 = (MobileElement) driver.findElementByAccessibilityId("plus");
        e10.click();

        MobileElement e11 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
        e11.click();

        MobileElement e12 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e12.click();

        MobileElement e13 = (MobileElement) driver.findElementByAccessibilityId("equals");
        e13.click();

        Assert.asserEquals(driver.findElementByID("com.android.calculator2:id/result").getText(),130)



        MobileElement e14 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e14.click();

        MobileElement e15 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e15.click();

        MobileElement e16 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e16.click();

        MobileElement e17 = (MobileElement) driver.findElementByAccessibilityId("multiplication");
        e17.click();

        MobileElement e18 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
        e18.click();

        MobileElement e19 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e19.click();

        MobileElement e20 = (MobileElement) driver.findElementByAccessibilityId("equals");
        e20.click();

        Assert.asserNotEquals(driver.findElementByID("com.android.calculator2:id/result").getText(),30)


        MobileElement e14 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
        e21.click();

        MobileElement e20 = (MobileElement) driver.findElementByAccessibilityId("equals");
        e22.click();

        Assert.asserNotEquals(driver.findElementByID("com.android.calculator2:id/result").getText(),30)


    }



}
