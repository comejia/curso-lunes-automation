package com.comejia.hooks;

import com.comejia.core.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hooks {

    private static WebDriver driver;
    private static Properties properties;

    @Before
    public void setup() throws IOException {
        properties = new Properties();

        properties.load(
                new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config.properties")
        );

        String browser = getProperty("browser");

        driver = DriverManager.getDriver(browser);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
