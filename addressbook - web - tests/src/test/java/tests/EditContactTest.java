package tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;


public class EditContactTest extends TestBase {


    @Test
    public void testEditContact() {
        app.getNavigationHelper().goToAddNewPage();
        app.getNavigationHelper().goToHomePage();
        app.getCreateContactHelper().selectContact();
        app.getCreateContactHelper().clickEditContact();
        app.getCreateContactHelper().fillContactForm(new ContactData("Tom", "Smith", "Updated",
                                               "777-888-55-66", null, " blvd 123"), false);

        app.getCreateContactHelper().clickUpdateButton();
        app.getCreateContactHelper().returnToHomePage();


    }


}
