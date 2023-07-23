package TestData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Demo {
        public static WebDriver driver;
        @Test
        public void testn() throws InterruptedException {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.get("https://www.saucedemo.com/");
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.name("password")).sendKeys("asdasd");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(By.className("submit-button btn_action")).click();


//            driver.close();
//            driver.manage().window().maximize();
//            driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
//            Thread.sleep(1000);
//
//            driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
//            Thread.sleep(1000);
//
//            driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
//            Thread.sleep(1000);
//
//            driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
//            Thread.sleep(1000);
//
//            driver.findElement(new By.ByLinkText("Sauce Labs Bike Light")).click();
//            Thread.sleep(1000);
//
//
//            driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[3]")).click();
//            Thread.sleep(1000);
//
//            driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
//
//
//            WebElement webelement = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
//            System.out.println(driver.getCurrentUrl());
//            if(webelement.isDisplayed() == true)
//
//            {System.out.println("test pass");}
//            else {
//                System.out.println("Fail");
//            }
//
//
//                Thread.sleep(6000);
//
//
//            for (int i=1;i<2;i++){
//                driver.manage().window().minimize();
//
//
//                    Thread.sleep(2000);
//
//                driver.manage().window().fullscreen();
//
//                    Thread.sleep(2000);
//
//                driver.manage().window().maximize();
//
//                    Thread.sleep(2000);
//
//
//                System.out.println(driver.getWindowHandle());
//            }








        }

    }

