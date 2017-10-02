package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class CreateContactTest extends TestBase {


    @Test
    public void testCreateContact() {

        app.getContactHelper().initCreateContact();
        app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "test3", "test4", "123456"));
        app.getContactHelper().submitContactForm();
        app.getContactHelper().returnToHomePage();
    }


}
