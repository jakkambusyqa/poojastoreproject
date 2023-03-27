package com.base.poojastore;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	public static Properties prop;
	public static WebDriver driver;

	FileInputStream file = null;

	public BaseClass() {

		String path = "C:\\Users\\jakkam sairam\\workspace\\PooojaStore\\src\\main\\java\\com\\configprop\\configproperties";
		prop = new Properties();
		try {
			file = new FileInputStream(path);
			try {
				prop.load(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void initialize() {

		String browser = prop.getProperty("browser");

		if (browser.equals("chrome"))
			driver = new ChromeDriver();

		if (browser.equals("edge"))
			driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("http://poojastore.marolix.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
}
