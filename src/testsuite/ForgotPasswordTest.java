package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class ForgotPasswordTest extends Utility {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        //click on forgot password link
        clickOnElement(By.xpath("//form/div/p [text() = 'Forgot your password? ']"));
        //verify the text 'Reset Password'
        //This is form requirement
        String expectedMessage = "Reset password";
        String actualMessage = getTextFromElement(By.xpath("//form/h6 [text() = 'Reset Password']")); //verify text reset password
        // Validate actual and expected message
        Assert.assertEquals("Not navigate to reset password", expectedMessage, actualMessage);


    }

    @After
    public void testDown() {
        closeBrowser();

    }
}