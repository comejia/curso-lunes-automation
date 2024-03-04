package com.comejia.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
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

        switch (browser) {
            case "chrome":
                driver = getChromeDriver();
                break;
            case "firefox":
                driver = getFirefoxDriver();
                break;
            default:
                throw new RuntimeException("Navegador no soportado");
        }
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

    public WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        options.addArguments("incognito");

//        options.addArguments("headless");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");

        return new ChromeDriver(options);
    }

    public WebDriver getFirefoxDriver() {
        return null;
    }
}
