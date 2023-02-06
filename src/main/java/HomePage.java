import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private WebDriver driver;
    By loginButton = By.xpath("//a/span[@class='header-account-label']");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public Login ClickOnLoginButton() {
        driver.findElement(loginButton).click();
        return new Login(driver);
    }
    public Register ClickLoginButton() {
        driver.findElement(loginButton).click();
        return new Register(driver);
}}
