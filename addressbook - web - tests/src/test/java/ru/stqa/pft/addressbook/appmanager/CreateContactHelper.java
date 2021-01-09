package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.ContactData;

public class CreateContactHelper extends HelperBase {


    public CreateContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillContactForm(ContactData contactData, boolean creation) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("company"), contactData.getCompany());
        type(By.name("mobile"), contactData.getPhone());
        if (creation) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }


        type(By.name("address2"), contactData.getAddress());
    }



    public void submitNewContact() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void returnToHomePage() {

        click(By.linkText("home page"));
    }

    public void selectContact() {
        click(By.id("18"));
    }

    public void clickEditContact() {
        click(By.xpath("//img[@alt='Edit']"));
    }



    public void clickUpdateButton() {
        click(By.xpath("(//input[@name='update'])[2]"));
    }


}
