package pageTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.*;
import singletonSession.Session;

public class TestBase {

    protected MainPage mainPage= new MainPage();

    protected HomePage homePage = new HomePage();

    protected LoginSection loginSection = new LoginSection();

    protected ProjectSesion projectSesion = new ProjectSesion();

    protected RegisterSection registerSection = new RegisterSection();
    @BeforeEach
    public void openBrowser(){
        Session.getSession().goTo("http://todoist.com/");
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeBrowser();
    }
}
