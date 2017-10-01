package addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {

    @Test
    public void testCreateGroup() {

        gotoGroupPage();
        initCreateGroup();
        fillGroupForm(new GroupData("test1", "test2", "test3"));
        submitCreateGroup();
        returnToGroupPage();
    }

}
