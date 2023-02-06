import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class testcase {
    private WebDriver driver;
    HomePage homePage;
    Login login;
    Register register;

    @BeforeClass                                 //لازم بعدها اكتب  function
    //و ال function بتبداء ديما ب public void setup
    public void Setup() {
        driver = new ChromeDriver();
        driver.get("https://jevancare.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }


    @Test(priority = 0 )
    public void RegisterWithinValidData() {
        register = homePage.ClickLoginButton();
        register.EnterEmail("moaekoaa@gmail.com");
        register.clickonregisterbutton();
        Assert.assertEquals(register.showregistermessege(), "Dashboard");
        register.ClickOnLogout();

    }

    @Test(priority = 1)
    public void loginWithValidData() {
        login = homePage.ClickOnLoginButton();
        login.EnterYourMail("maryerian30@yahoo.com");
        login.EnterYourPassword("MaryErian199");
        login.ScrollDown();
        login.ClickOnLogin();
        Assert.assertEquals(register.showregistermessege(), "Dashboard");


    }

    @AfterClass
    public void CloseBrowser() {
        driver.quit();
    }
}






