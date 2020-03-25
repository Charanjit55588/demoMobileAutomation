package driverconfig;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import driverconfig.DriverConfiguration.DriverConfiguation;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSRemote implements DriverConfiguation {

	private String accessKey = "pLFxDQJCvFNijTYVqX2q";
	private static String userName = "charanjitsingh3";

	@Override
	public IOSDriver<IOSElement> setUpConfiguration() throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		System.out.println("IOSRemote Selected");
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("device", "iPhone 8 Plus");
		caps.setCapability("os_version", "11");
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("app", "url of the app");

		IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(
				new URL("http://" + userName + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"), caps);

		System.out.println(driver);
		return driver;

	}

}
