package addressbook.tests;

import addressbook.model.GroupData;
import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testCreateGroup() {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initCreateGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("test1", "test2", "test3"));
        app.getGroupHelper().submitCreateGroup();
        app.getGroupHelper().returnToGroupPage();
    }

}
