package co.com.sophos.stepdefinitions;


import co.com.sophos.exceptions.ManageException;
import co.com.sophos.models.Data;
import co.com.sophos.questions.SuccessfullBuy;
import co.com.sophos.tasks.SelectProduct;
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
import org.openqa.selenium.WebDriver;

import java.util.List;

import static co.com.sophos.utils.Constant.Constant.*;

public class BuyProductStepDefinition {

    @Managed(driver = "Chrome")
    private WebDriver hisBrowser;

    @Before
    public void before()
    {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("the user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^the user was navigated in the web$")
    public void theUserWasNavigatedInTheWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.wong.pe/especiales/cyberwong"));
    }

    @When("^the user select a product$")
    public void theUserSelectAProduct(List<Data>list) {
        OnStage.theActorInTheSpotlight().wasAbleTo(SelectProduct.inTheWeb(list.get(0)));

    }

    @Then("^the user should see the message successfull$")
    public void theUserShouldSeeTheMessageSuccessfull() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(SuccessfullBuy.inTheWeb())
                .orComplainWith(ManageException.class, MESSAGE_SUCCESSFULL));
    }
}