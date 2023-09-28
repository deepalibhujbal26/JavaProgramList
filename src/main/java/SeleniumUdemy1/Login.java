package SeleniumUdemy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        //ChromeDriver obj=new ChromeDriver("");
       WebDriver chrome= new ChromeDriver();
        chrome.manage().window().maximize();
        Thread.sleep(200);
        //open url in browser
        chrome.navigate().to("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        System.out.println(chrome.getTitle());

        //provide username=ADMIN
       WebElement txtUsername = chrome.findElement(By.name("txtUsername"));
       txtUsername.sendKeys("Admin");


        //provide Password
        WebElement txtUserPwd = chrome.findElement(By.name("txtPassword"));
        txtUserPwd.sendKeys("Hum@nhrm123");

        //click on login button

        WebElement button =chrome.findElement(By.name("Submit"));
        button.click();

        //Verfiy the title dashboard page

        String act_title=chrome.getTitle();
        String exp_title="Human Management System";

        if(act_title.equals(exp_title)){
            System.out.println("Test passed");
        }
        else{
            System.out.println("Failed---");
        }
//  close browser
        chrome.close();









    }



}
