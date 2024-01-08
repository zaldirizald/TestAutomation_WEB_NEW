package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.page.SearchArticle;

public class SearchArticleSteps {
    @Steps
    SearchArticle searchArticle;

    @Given("User on landing page")
    public void userOnLandingPage() {
        searchArticle.onLoginPage();

    }

    @When("User input valid Keyword")
    public void userInputValidKeyword() {
        searchArticle.UserClickQuestionBox();
        searchArticle.UserInputKeyword("Cara lupas password Sister");
        searchArticle.UserClickButtonTanya();
    }

    @And("User want to click more")
    public void userWantToClickMore() {
        searchArticle.UserClickMore();
    }

    @Then("User can see Article")
    public void userCanSeeArticle() {
        searchArticle.UserClickArticle();
    }
}
