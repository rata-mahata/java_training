package addressbook.tests;

import org.testng.annotations.Test;

public class DeleteContactTest extends TestBase {

    
    @Test
    public void testDeleteContact() {

        app.selectContact();
        app.deleteSelectedContact();
    }



}
