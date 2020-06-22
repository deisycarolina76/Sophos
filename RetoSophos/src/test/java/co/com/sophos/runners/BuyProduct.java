package co.com.sophos.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/buy_product.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "co.com.sophos.stepdefinitions"
)
public class BuyProduct {
}