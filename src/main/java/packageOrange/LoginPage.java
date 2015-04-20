package packageOrange;

import org.openqa.selenium.By;

/**
 * Created by Remya on 12/30/2014.
 */
public class LoginPage extends BaseClass {

    public void gotoLoginPage(){


    }

    public  void logout(){
        driver.findElement(By.id("welcome")).click();
        driver.findElement(By.linkText("Logout")).click();
    }
}
