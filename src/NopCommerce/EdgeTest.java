package NopCommerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTest {

    public static void main(String[] args) {

        String baseUrl = "https://www.nopcommerce.com/demo";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        String getTitle = driver.getTitle();
        System.out.println(getTitle);
        driver.close();

    }
}
