package Class21;

public abstract class WebDriver {

    abstract void openBrowser();

    abstract void loadURL(String url);

    abstract void performTesting();

    abstract void close();
}

class ChromeDriver extends WebDriver {

    @Override
    void openBrowser() {
        System.out.println("Opening the google chrome : ");

    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the URL" + url);

    }

    @Override
    void performTesting() {
        System.out.println("Performing Testing");

    }

    @Override
    void close() {
        System.out.println("CLosing the  Chrome browser ");

    }
}
class FirefoxDriver extends WebDriver{

    @Override
    void openBrowser() {
        System.out.println("Opening Firefox browser");

    }

    @Override
    void loadURL(String url) {
        System.out.println("Loading the url"+url);

    }

    @Override
    void performTesting() {
        System.out.println("Performing the testing");

    }

    @Override
    void close() {
        System.out.println("CLosing the firefox browser");

    }
}

