package tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class AddNewContact extends TestBase {



  @Test
  public void testAddNewContact() throws Exception {

    app.getNavigationHelper().goToAddNewPage();
    app.getCreateContactHelper().fillContactForm(new ContactData("Stan", "Zhyvykh", "Test", "727-288-5277",
                                                                 "test1", "187 Clubhouse Dr"), true  );

    app.getCreateContactHelper().submitNewContact();
    app.getCreateContactHelper().returnToHomePage();
  }

}
