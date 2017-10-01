package addressbook;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class CreateContactTest extends TestBase {


    @Test
    public void testCreateContact() {

        initCreateContact();
        fillContactForm(new ContactData("test1", "test2", "test3", "test4", "123456"));
        submitContactForm();
        returnToHomePage();
    }


}
