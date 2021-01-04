package tests;

import org.testng.annotations.Test;


public class EditContactTest extends TestBase {


    @Test
    public void testEditContact() {
        app.getNavigationHelper().goToAddNewPage();
        app.getNavigationHelper().goToHomePage();
        app.getCreateContactHelper().selectContact();
        app.getCreateContactHelper().clickEditContact();
        app.getCreateContactHelper().editFirstName("Updated1234");
        app.getCreateContactHelper().clickUpdateButton();
        app.getCreateContactHelper().returnToHomePage();


    }


}
