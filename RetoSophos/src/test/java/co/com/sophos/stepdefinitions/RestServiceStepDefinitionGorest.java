package co.com.sophos.stepdefinitions;

import co.com.sophos.exceptions.ManageException;
import co.com.sophos.models.CredentialsRestService;
import co.com.sophos.questions.ResponseRequestMessage;
import co.com.sophos.tasks.ConsumeRestServiceGorest;
import co.com.sophos.utils.Constant.Constant;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class RestServiceStepDefinitionGorest {
    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;

    @Given("^The user was navigated in the web$")
    public void theUserWasNavigatedInTheWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://gorest.co.in/"));
    }
    @When("^User is consuming a service$")
    public void userIsConsumingAService(List<CredentialsRestService> credentialsRestServices) {
        OnStage.theActorInTheSpotlight().attemptsTo(ConsumeRestServiceGorest.in(credentialsRestServices.get(0)));
    }
    @Then("^The user will see a first name: (.*)$")
    public void theUserWillSeeAFirstNameJhojasi(String message) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ResponseRequestMessage.contain(),
                Matchers.containsString(message)).orComplainWith(ManageException.class, Constant.DATA_NOT_FOUND));
    }
}