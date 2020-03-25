package driverconfig;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class DriverConfiguration {

	public interface DriverConfiguation {
		public IOSDriver<IOSElement> setUpConfiguration() throws InterruptedException, MalformedURLException;

	}

}
