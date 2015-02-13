import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities

waiting { timeout = 120}

environments {
    // run via ./gradlew chromeTest
    // See: http://code.google.com/p/selenium/wiki/ChromeDriver
    chrome {
        driver = {
            // Add the WebDriver direct proxy capability.
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            def proxy = new org.openqa.selenium.Proxy();
            proxy.setProxyType(org.openqa.selenium.Proxy.ProxyType.DIRECT)
            capabilities.setCapability("proxy", proxy);

            def options = new ChromeOptions()
            options.addArguments("ignore-certificate-errors")
            options.addArguments("test-type")
            capabilities.setCapability(ChromeOptions.CAPABILITY, options)
            def chromeDriver = new ChromeDriver()
            chromeDriver.manage().window().maximize()
            return chromeDriver
        }
    }
}