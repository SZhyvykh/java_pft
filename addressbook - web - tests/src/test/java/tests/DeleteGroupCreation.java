package tests;


import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class DeleteGroupCreation extends TestBase {




  @Test
  public void testGroupDeletion() throws Exception {

    goToGroupPage();
    selectGroup();
    deleteSelectedGroup();
    returnToGroupPage();
  }

}
