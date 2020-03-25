package manager;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;

import com.google.common.collect.ImmutableMap;

import org.apache.http.conn.ConnectionRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Keys;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverconfig.DriverConfiguration;
import driverconfig.DriverConfiguration.DriverConfiguation;
import driverconfig.DriverSelector;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class ActionManager {

	public static IOSDriver<IOSElement> driver;
	// should be the first code in this class
	static {
		try {
			DriverSelector driverSelector = new DriverSelector();
			// the arguments of getDriver can be set to IOSLocal/IOSRemote
			DriverConfiguation driverconfig = driverSelector.getDriver("IOSRemote");
			ActionManager.driver = driverconfig.setUpConfiguration();
		} catch (IOException | InterruptedException e) {
			System.out.print("Timeout exception");
			throw new RuntimeException();
		}
	}
	
	public static void click(By locator) {
		driver.findElement(locator).click();
	}

	public static void sendKeys(By locator, String keys) {
		driver.findElement(locator).sendKeys(keys);
	}
}
