package packageOrange;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.runtime.PendingException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Remya on 12/30/2014.
 */
public class StepDef extends BaseClass{

    LoginPage log=new LoginPage();


    @Before
    public void openBrowser(){
        driver=new FirefoxDriver();
    }

    @After
    public  void closeBrowser(){

        driver.quit();
    }

    @Given("^Admin is in login page$")
    public void gotoHomePage()  {
        driver.get("http://insoftt.trial47.orangehrmlive.com/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("^admin sign in with the username \"([^\"]*)\"$")
    public void admin_sign_in_with_the_username(String userName) {
        driver.findElement(By.id("txtUsername")).sendKeys(userName);
        // Express the Regexp above with the code you wish you had

    }

    @When("^admin sign in with password \"([^\"]*)\"$")
    public void admin_sign_in_with_password(String passWrd) {

        driver.findElement(By.id("txtPassword")).sendKeys(passWrd);
        driver.findElement(By.id("btnLogin")).click();
        // Express the Regexp above with the code you wish you had

    }


    @Then("^admin should be logged in$")
    public void I_should_be_logged_in()  {

        Assert.assertEquals("Welcome Admin", driver.findElement(By.id("welcome")).getText());
        driver.findElement(By.id("welcome")).click();
        driver.findElement(By.linkText("Logout")).click();

    }

    @When("^admin enters username as'(.*)'$")
    public void admin_enters_username_as_(String arg) {
        // Express the Regexp above with the code you wish you had
        driver.findElement(By.id("txtUsername")).sendKeys(arg);

    }

    @When("^admin enters password as '(.*)'$")
    public void admin_enters_password_as_(String arg1) {
        driver.findElement(By.id("txtPassword")).sendKeys(arg1);
        driver.findElement(By.id("btnLogin")).click();
        // Express the Regexp above with the code you wish you had
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Then("^admin should not be logged in$")
    public void admin_should_not_be_logged_in() {

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("LOGIN Panel"));


      }


}
