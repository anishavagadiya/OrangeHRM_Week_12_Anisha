package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        sendTextToElement(By.name("username"), "Admin"); //Enter valid username
        sendTextToElement(By.name("password"), "admin123"); //Enter valid password
        //click on login button
        clickOnElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
         // verify the "Dashboard" text is display
        //This is form requirement
        String expectedMessage = "Dashboard text is display";
        String actualMessage = getTextFromElement(By.xpath("//span/h6 [text()='Dashboard']")); //verify Dashboard text is display
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to Dashboard text is display", expectedMessage, actualMessage);
}
@After
    public void testDown(){
        closeBrowser();

}


}
