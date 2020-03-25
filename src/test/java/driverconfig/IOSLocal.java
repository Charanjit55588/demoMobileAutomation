package driverconfig;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import driverconfig.DriverConfiguration.DriverConfiguation;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSLocal implements DriverConfiguation {

	@Override
	public IOSDriver<IOSElement> setUpConfiguration() throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		System.out.println("IOSLocal Selected");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("app", "somebundleId");
		caps.setCapability("deviceName", "iPhone XR");
		caps.setCapability("automationName", "XCUITest");
		caps.setCapability("platformName", "ios");
		caps.setCapability("platformVersion", "12.1");
		caps.setCapability("waitForQuiescence", false);

		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

		return driver;
	}

}
