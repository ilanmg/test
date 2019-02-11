package selenium.driver;

import static java.util.concurrent.TimeUnit.SECONDS;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.github.bonigarcia.wdm.EdgeDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import io.github.bonigarcia.wdm.OperaDriverManager;
import io.github.bonigarcia.wdm.PhantomJsDriverManager;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class WebDriverRemoteBuilder {

    private String name;
    private final WebDriverConfig webDriverConfig;
    private String userAgent;
    private boolean disableCookies;

    private String seleniumHubUrl;


    public WebDriverRemoteBuilder(WebDriverConfig webDriverConfig) {
        this.webDriverConfig = webDriverConfig;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void userAgent(final UserAgents userAgent) {
        this.userAgent = userAgent.getValue();
    }

    public void disableCookies(boolean cookies) {
        this.disableCookies = cookies;
    }


    public WebDriver toWebDriver() {
        DesiredCapabilitiesFactory desiredCapabilitiesFactory = new DesiredCapabilitiesFactory();
        DesiredCapabilities capabilities = desiredCapabilitiesFactory.initDesiredCapabilities(webDriverConfig, userAgent, disableCookies);
        String browser = webDriverConfig.getBrowserName();
        seleniumHubUrl = webDriverConfig.getSeleniumHbUrl();

        DesiredCapabilities capability;

        switch (browser) {
            case "firefox":
                capability = DesiredCapabilities.firefox();
                capability.setBrowserName("firefox");
                capability.setPlatform(Platform.LINUX);
                try {
                    return new RemoteWebDriver(new URL(seleniumHubUrl), capability);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    return null;
                }
            case "edge":
                EdgeDriverManager.getInstance().setup();
                final EdgeDriver edgeDriver = new EdgeDriver(capabilities);
                edgeDriver.manage().window().maximize();
                return edgeDriver;
            case "internetexplorer":
                InternetExplorerDriverManager.getInstance().setup();
                final InternetExplorerDriver internetExplorerDriver = new InternetExplorerDriver(capabilities);
                internetExplorerDriver.manage().window().maximize();
                return internetExplorerDriver;
            case "opera":
                OperaDriverManager.getInstance().setup();
                final OperaDriver operaDriver = new OperaDriver(capabilities);
                operaDriver.manage().window().maximize();
                return operaDriver;
            case "phantomjs":
                PhantomJsDriverManager.getInstance().setup();
                final PhantomJSDriver phantomJsWebDriver = new PhantomJSDriver(capabilities);
                phantomJsWebDriver.manage().timeouts().implicitlyWait(webDriverConfig.getImplicitlyWait(), SECONDS);
                phantomJsWebDriver.manage().timeouts().setScriptTimeout(webDriverConfig.getDomMaxScriptRunTime(), SECONDS);
                phantomJsWebDriver.manage().window().maximize();
                return phantomJsWebDriver;
            default:
                capability = DesiredCapabilities.chrome();
                capability.setBrowserName("chrome");
                capability.setPlatform(Platform.LINUX);
                try {
                    return new RemoteWebDriver(new URL(seleniumHubUrl), capability);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    return null;
                }
        }
    }
}