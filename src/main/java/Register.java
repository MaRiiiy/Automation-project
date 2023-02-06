import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Register {
    private WebDriver driver;
    By Email = By.id("reg_email");
    By RegisterButtom = By.xpath("//button[@name='register']");
    //By regitermessage = By.xpath("//h1[@class='entry-title']");
    By registermessage =By.linkText("Dashboard");
    By logout =By.xpath("//div  /p /a[contains(text(),'Log out')]");
    public Register(WebDriver driver) {
        this.driver = driver;
    }
    public void EnterEmail(String h) {//f is a function i can put any string in it
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Email).sendKeys(h);}
    public void clickonregisterbutton() {
        driver.findElement(RegisterButtom).click();
    }
    public String showregistermessege() {
        return driver.findElement(registermessage).getText();
    }
    public void ClickOnLogout(){
        driver.findElement(logout).click();
    }
}

