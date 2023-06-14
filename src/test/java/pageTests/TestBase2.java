package pageTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pagesTodoly.*;
import singletonSession.Session;

public class TestBase2 {

    protected MainPage mainPage= new MainPage();

    protected HomePage homePage = new HomePage();

    protected LoginSection loginSection = new LoginSection();

    protected SettingsSection settingsSection = new SettingsSection();
    @BeforeEach
    public void openBrowser(){
        Session.getSession().goTo("http://todo.ly/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeBrowser();
    }
}
