package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ModifyContactTest extends TestBase {

    @Test
    public void testModifyContact() {
        app.getContactHelper().selectContact();
        app.getContactHelper().initModifyContact();
        app.getContactHelper().fillContactForm(new ContactData("test1", "test2", "test3", "test4", "123456"));
        app.getContactHelper().submitModifyForm();
        app.getContactHelper().returnToHomePage();
    }

}
