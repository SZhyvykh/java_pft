package tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class EditGroupTest extends TestBase {

    @Test
    public void testEditGroup() {
        app.getNavigationHelper().goToGroupPage();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData("test1", null, null));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().clickEditGroup();
        app.getGroupHelper().editGroupHeader("Updated value");
        app.getGroupHelper().updateEditedGroup();
        app.getGroupHelper().returnToGroupPage();


    }


}
