package tests;


import org.testng.annotations.Test;


public class DeleteGroupCreation extends TestBase {




  @Test
  public void testGroupDeletion() throws Exception {

    applicationManager.goToGroupPage();
    applicationManager.selectGroup();
    applicationManager.deleteSelectedGroup();
    applicationManager.returnToGroupPage();
  }

}
