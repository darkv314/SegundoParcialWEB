package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class RegisterSection {



    public TextBox emailTxtBox = new TextBox(By.xpath("//input[@id='element-0']"));

    public TextBox pwdTxtBox = new TextBox(By.xpath("//input[@id='element-3']"));

    public TextBox nameTxtBox = new TextBox(By.xpath("//input[@id='element-0']"));

    public Button skip = new Button(By.xpath("//button//span[text()='Skip']"));

    public Button signUpButton = new Button(By.xpath("//button//span[text()='Sign up with Email']"));
}
