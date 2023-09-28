package Review10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AnimalTester {
    public static void main(String[] args) {
        Animal[] obj = {new Cat(), new Dog()};
        for (Animal a : obj) {
            a.speak();
            a.eat();
        }
        /*ChromeDriver c = new ChromeDriver();
        c.manage().window().maximize();
        c.get("https://www.amazon.com");
        c.getTitle();

        FirefoxDriver f = new FirefoxDriver;
        f.manage().window().maximize();
        f.get("https://www.amazon.com");
        f.getTitle();

        EdgeDriver e = new EdgeDriver();
        e.manage().window().maximize();
        e.get("https://www.amazon.com");
        e.getTitle(); */

        WebDriver [] webDrivers={new ChromeDriver () , new FirefoxDriver() };

        for (int i = 0; i < webDrivers. length; i++) {
            WebDriver w=webDrivers[i];
            w.manage () .window() .maximize();
            w.get ("https://www.amazon.com");
            System.out.println(w.getTitle());

        }
    }
}


