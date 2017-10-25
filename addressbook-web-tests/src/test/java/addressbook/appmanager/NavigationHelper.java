package addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationHelper extends HelperBase {


    public NavigationHelper(WebDriver wd) {

        super(wd);
    }

    public void gotoGroupPage() {

        if ( isElementPresent(By.tagName("h1"))
                && wd.findElement(By.tagName("h1")).getText().equals("Groups")
                && isElementPresent(By.name("new"))) {
            return;

        }
        click(By.linkText("groups"));
    }

    protected boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true;
            } catch (NoSuchElementException ex) {
            return false;

        }
    }
}
