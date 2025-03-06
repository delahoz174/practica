package com.co.practicaScreenplay_N2.stepsdefinitions;

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
import com.co.practicaScreenplay_N2.questions.CompareName;
import com.co.practicaScreenplay_N2.tasks.LoginTask;

import static com.co.practicaScreenplay_N2.utils.Credenciales.URL;

public class LoginStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public  void setUP (){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^el usuario abre la pagina web$")
    public void elUsuarioAbreLaPaginaWeb() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));

    }


    @When("^el usuario ingresa las credenciales$")
    public void elUsuarioIngresaLasCredenciales() {

        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.enterCredencial());

    }

    @Then("^el usuario podra ver su nombre$")
    public void elUsuarioPodraVerSuNombre() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareName.compare()
        , Matchers.is("Welcome admin")));

    }
}
