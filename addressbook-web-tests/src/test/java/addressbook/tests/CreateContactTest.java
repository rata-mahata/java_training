package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class CreateContactTest extends TestBase {


    @Test
    public void testCreateContact() {

        app.getContactHelper().initCreateContact();
        app.getContactHelper().fillContactForm(new ContactData("test1",null,null,null,null));
        app.getContactHelper().submitContactForm();
        app.getContactHelper().returnToHomePage();
    }


}
