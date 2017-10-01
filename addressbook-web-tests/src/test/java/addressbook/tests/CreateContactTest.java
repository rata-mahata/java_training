package addressbook.tests;

import org.testng.annotations.Test;

public class CreateContactTest extends TestBase {


    @Test
    public void testCreateContact() {

        app.initCreateContact();
        app.fillContactForm(new ContactData("test1", "test2", "test3", "test4", "123456"));
        app.submitContactForm();
        app.returnToHomePage();
    }


}
