package com.comejia.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class DriverManager {

    public static WebDriver getDriver(String browser) {
        switch (browser) {
            case "chrome":
                return getChromeDriver();
            case "firefox":
                return getFirefoxDriver();
            default:
                throw new RuntimeException("Navegador no soportado");
        }
    }

    private static WebDriver getChromeDriver() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");
        options.addArguments("incognito");
//        options.addArguments("headless");
        options.setPageLoadTimeout(Duration.ofSeconds(60));

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");

        return new ChromeDriver(options);
    }

    private static WebDriver getFirefoxDriver() {
        FirefoxOptions options = new FirefoxOptions();

        options.addArguments("--private");
        options.setPageLoadTimeout(Duration.ofSeconds(60));

        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/drivers/geckodriver");

        return new FirefoxDriver(options);
    }
}
