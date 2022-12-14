package day55_polymorphism.Extra_Final;

import day55_polymorphism.DriverTask.ChromeDriver;
import day55_polymorphism.DriverTask.FirefoxDriver;
import day55_polymorphism.DriverTask.SafariDriver;
import day55_polymorphism.DriverTask.WebDriver;

public class P01_Intro {

    public static void main(String[] args) {

        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("www.google.com");


        WebDriver driver=new ChromeDriver();
        // Reference Type       Objects Type

        driver.get("www.google.com");
        // since we have overriden version of this method
        // it will executed from child class


        WebDriver safari=new SafariDriver();
        safari.get("www.google.com");
        // since it is not overriden it will execute code from parent (RemoteWebDriver)
        // safari.talk(); it is not accesible from safari reference type .We can do down casting to access it

        WebDriver firefox=new FirefoxDriver();
        firefox.get("www.google.com");
        // since it is not overriden it will execute code from parent (RemoteWebDriver)

    }
}


