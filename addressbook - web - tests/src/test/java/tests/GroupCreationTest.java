package tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.GroupData;

public class GroupCreationTest extends TestBase  {

  @Test
  public void testGroupCreation() throws Exception {

    applicationManager.goToGroupPage();
    applicationManager.initGroupCreation();
    applicationManager.fillGroupForm(new GroupData("test1", "test2", "test3"));
    applicationManager.submitGroupCreation();
    applicationManager.returnToGroupPage();
  }

}
