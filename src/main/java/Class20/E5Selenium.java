package Class20;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class E5Selenium {
    public static void main(String[] args) throws InterruptedException {
       /* SafariDriver safari = new SafariDriver();
        safari.manage().window().maximize();
        Thread.sleep(2000);
        safari.navigate().to("https://google.com");
                System.out.println(safari.getTitle());
        Thread.sleep(2000);
        safari.navigate().to("https://facebook.com");
                System.out.println(safari.getTitle());
        Thread.sleep(2000);
        safari.navigate().to("https://amazon.com");
                System.out.println(safari.getTitle());
        Thread.sleep(2000);
        safari.navigate().back();
        safari.close(); */
        ChromeDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        Thread.sleep(2000);
        chrome.navigate().to("https://google.com");
                System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://facebook.com");
                System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://amazon.com");
                System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().back();
        chrome.close();


        FirefoxDriver firefox=new FirefoxDriver();
        firefox.manage().window().maximize();
        Thread.sleep(2000);
        firefox.navigate().to("https://google.com");
                System.out.println(firefox.getTitle());
        Thread.sleep(2000);
        firefox.navigate().to("https://facebook.com");
                System.out.println(firefox.getTitle());
        Thread.sleep(2000);
        firefox.navigate().to("https://amazon.com");
                System.out.println(firefox.getTitle());
        Thread.sleep(2000);
        firefox.navigate().back();
        firefox.close();

        EdgeDriver EdgeDriver=new EdgeDriver();
        EdgeDriver.manage().window().maximize();
        Thread.sleep(2000);
        EdgeDriver.navigate().to("https://google.com");
                System.out.println(EdgeDriver.getTitle());
        Thread.sleep(2000);
        EdgeDriver.navigate().to("https://facebook.com");
                System.out.println(EdgeDriver.getTitle());
        Thread.sleep(2000);
        EdgeDriver.navigate().to("https://amazon.com");
                System.out.println(EdgeDriver.getTitle());
        Thread.sleep(2000);
        EdgeDriver.navigate().back();
        EdgeDriver.close();



    }
}
