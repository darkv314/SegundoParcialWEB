package pageTests;

import org.junit.jupiter.api.Test;

public class Pregunta3 extends TestBase{


    @Test
    public void verifyPregunta3() {
        mainPage.registerButton.click();

        registerSection.emailTxtBox.setText("vanetejerina3141516@gmail.com");
        registerSection.pwdTxtBox.setText("Pass12345");
        registerSection.signUpButton.click();

        registerSection.nameTxtBox.setText("Vanessa");
        registerSection.skip.click();



    }
}
