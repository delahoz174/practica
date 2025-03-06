package com.co.practicaScreenplay_N2.stepsdefinitions;

import com.co.practicaScreenplay_N2.questions.CompareName;
import com.co.practicaScreenplay_N2.questions.CompareValor;
import com.co.practicaScreenplay_N2.tasks.LoginTask;
import com.co.practicaScreenplay_N2.tasks.SeleccionProductoTask;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

public class SeleccionProductosStepDefinition {

    @When("^el usuario agrega tres productos al carrito$")
    public void elUsuarioAgregaTresProductosAlCarrito() {

            OnStage.theActorInTheSpotlight().attemptsTo(SeleccionProductoTask.seleccionarProducto());

    }

    @Then("^el total en el carrito debe ser (\\d+)$")
    public void elTotalEnElCarritoDebeSer(int arg1) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareValor.compare()
                , Matchers.is("1830")));
    }

}
