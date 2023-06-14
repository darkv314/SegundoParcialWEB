package pageTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Pregunta3 extends TestBase{

    private Random rand = new Random();
    @Test
    public void verifyPregunta3() throws InterruptedException {
        mainPage.registerButton.click();

        registerSection.emailTxtBox.setText("vanetejerina6"+rand.nextInt(10000)+"@gmail.com");
        registerSection.pwdTxtBox.setText("Pass12345");
        registerSection.signUpButton.click();

        Thread.sleep(15000);

        registerSection.nameTxtBox.setText("Vanessa");
        registerSection.continueButton.click();


        Thread.sleep(2000);
        registerSection.skip.click();

        Thread.sleep(10000);

        String name = "New name";
        homePage.projectSection.click();
        homePage.addProjectButton.click();
        projectSesion.projectName.setText(name);
        projectSesion.buttonColor.click();
        projectSesion.blueButton.click();
        projectSesion.addButton.click();

        Assertions.assertEquals(homePage.checkNewProject(name).getTextValue(), name, "El proyecto no se ha creado exitosamente");


    }
}
