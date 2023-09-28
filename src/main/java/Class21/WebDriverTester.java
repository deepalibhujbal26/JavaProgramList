package Class21;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] arr = {new ChromeDriver(), new FirefoxDriver()};
        for (WebDriver a : arr) {
            a.openBrowser();
            a.loadURL("google.com");
            a.performTesting();
            a.close();
        }


    }
}
