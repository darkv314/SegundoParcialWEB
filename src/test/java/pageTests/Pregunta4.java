package pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Pregunta4 extends TestBase2{

    @Test
    public void verifyPregunta3() throws InterruptedException {
        mainPage.loginButton.click();
        loginSection.emailTxtBox.setText("vanetejerina314@gmail.com");
        loginSection.pwdTxtBox.setText("12345");
        loginSection.loginButton.click();

        Thread.sleep(5000);

        homePage.settingsButton.click();

        Thread.sleep(5000);


        settingsSection.oldPwdTxtBox.setText("12345");
        settingsSection.newPwdTxtBox.setText("123456");

        settingsSection.saveButton.click();

        Thread.sleep(5000);

        homePage.logoutButton.click();

        Thread.sleep(5000);

        mainPage.loginButton.click();
        loginSection.emailTxtBox.setText("vanetejerina314@gmail.com");
        loginSection.pwdTxtBox.setText("123456");
        loginSection.loginButton.click();

        Thread.sleep(5000);
        Assertions.assertTrue(homePage.settingsButton.isControlDisplayed(), "ERROR, no se ha podido cambiar la contraseña");



    }


}
