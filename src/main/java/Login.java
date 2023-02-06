import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Login {
    private WebDriver driver;
    By Email=By.id("username");
    By password=By.id("password");
    By loginButton=By.xpath("//button[@name='login']");
    By registermessage =By.linkText("Dashboard");


    public Login(WebDriver driver) {
        this.driver =driver;
    }
    public void EnterYourMail(String f) {//f is a function i can put any string in it
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(Email).sendKeys(f);
    }
    public void ScrollDown ()
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",driver.findElement(loginButton) ) ;

    }
    public void EnterYourPassword(String h){

        driver.findElement(password).sendKeys(h);//send keys mean to click and write something in it
    }
    public void ClickOnLogin(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(loginButton).click();
    }
    public String showregistermessege() {
        return driver.findElement(registermessage).getText();

}}
