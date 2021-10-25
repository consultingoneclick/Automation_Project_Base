package bdd.stepdef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sd_verifyTitle {

    WebDriver wd;
    String title="OneClick Consulting | Gateway to your Carrer | Professionals working together for your sucess |";

    @Given("^user is in oneclick cosulting page$")
    public void userIsInOneclickCosultingPage() {
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
        wd.get("http://consultoneclick.com/");
        wd.manage().window().maximize();
    }

    @When("^user verifies the title of the page$")
    public void userVerifiesTheTitleOfThePage() {
        Assert.assertEquals(wd.getTitle(),title);
    }

    @When("^user verifies the contact of the page$")
    public void userVerifiesTheContactOfThePage() {
        Assert.assertEquals(wd.getTitle(),title+"test");

    }

    @Then("^user exists the browser$")
    public void userExistsTheBrowser() {
        wd.close();
    }


    @Given("^user is in \"([^\"]*)\"$")
    public void userIsIn(String website) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("printing" + website);
        throw new PendingException();
    }
}
