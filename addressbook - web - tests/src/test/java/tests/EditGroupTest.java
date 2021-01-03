package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EditGroupTest extends TestBase {

    @Test
    public void testEditGroup() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().clickEditGroup();
        app.getGroupHelper().editGroupHeader("Updated value");
        app.getGroupHelper().updatedEditedGroup();
        app.getGroupHelper().returnToGroupPage();


    }


}
