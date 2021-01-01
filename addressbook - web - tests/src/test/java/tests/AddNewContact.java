package tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.ContactData;

public class AddNewContact extends TestBase {



  @Test
  public void testAddNewContact() throws Exception {

    applicationManager.goToAddNewPage();
    applicationManager.fillContactForm(new ContactData("Stan", "Zhyvykh", "Test", "727-288-5277", "12345 dr"));
    applicationManager.submitNewContact();
    applicationManager.goToHomePage();
  }

}
