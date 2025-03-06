package com.co.practicaScreenplay_N2.stepsdefinitions;

import com.co.practicaScreenplay_N2.questions.InicioDeSesionQuestion;
import com.co.practicaScreenplay_N2.tasks.InicioDeSesionTask;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;


import static com.co.practicaScreenplay_N2.utils.Credenciales.*;



public class InicioDeSesionStepDefinition {
    @Managed
    WebDriver hisBrowser;

    @Before
    public  void setUP (){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^que el usuario abre la pagina de inicio de sesion$")
    public void queElUsuarioAbreLaPaginaDeInicioDeSesion() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }


    @Cuando("^ingrese las credenciales validas$")
    public void elUsuarioIngresaLasCredenciales() {
            OnStage.theActorInTheSpotlight().attemptsTo(
                    InicioDeSesionTask.conCredenciales(USUARIO, CONTRASENA)
            );

        }

    @Entonces("^deberia ver el texto \"([^\"]*)\"$")
    public void deberiaVerElTexto(String mensaje) throws Throwable {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(InicioDeSesionQuestion.credencialesvalidas()
                , Matchers.is(mensaje)));
    }

    @Cuando("^ingrese credenciales no validas$")
    public void ingreseCredencialesNoValidas() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InicioDeSesionTask.conCredenciales(USUARIO, CONTRASENA_INVALIDA)
        );
    }

    @Entonces("^deberia ver el error \"([^\"]*)\"$")
    public void deberiaVerElError(String error) throws Throwable {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(InicioDeSesionQuestion.credencialesnovalidas()
                , Matchers.is(error)));
    }
}

