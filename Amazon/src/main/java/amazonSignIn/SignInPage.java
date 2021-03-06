package amazonSignIn;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends CommonAPI {

    @FindBy(id = "nav-link-accountList")
    WebElement signInFromListBtn;
    @FindBy(id="ap_email")
    WebElement emailBtn;
    @FindBy(id = "continue")
    WebElement continueBtn;
    @FindBy(css = "input[type='password']")
    WebElement passwordBtn;
    @FindBy(css = "span[class='a-button-inner']")
    WebElement signInBtn;

    public void goToSignIn() {
        signInFromListBtn.click();
    }

    public void signIn(String name, String password) {
        goToSignIn();
        emailBtn.sendKeys(name);
        continueBtn.click();
        passwordBtn.sendKeys(password);
        signInBtn.click();
    }
}
