package com.co.practicaScreenplay_N2.stepsdefinitions;

import com.co.practicaScreenplay_N2.questions.AdministradorQuestion;
import com.co.practicaScreenplay_N2.questions.BuscarEmpleadoQuestion;
import com.co.practicaScreenplay_N2.tasks.BuscarEmpleadoTask;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.practicaScreenplay_N2.utils.Constantes.USUARIO;


public class BuscarEmpleadoStepDefinition {
    @Cuando("^el usuario sea redirigido a System Users$")
    public void elUsuarioSeaRedirigidoASystemUsers() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AdministradorQuestion.compare()
                , Matchers.is("System Users")));
    }

    @Y("^escriba el nombre de usuario y presione el boton Search$")
    public void escribaElNombreDeUsuarioYPresioneElBotónSearch() {
        OnStage.theActorInTheSpotlight().attemptsTo(BuscarEmpleadoTask.SearchUsername());

    }

    @Entonces("^el sistema debe mostrar en la lista al empleado recien agregado$")
    public void elSistemaDebeMostrarEnLaListaAlEmpleadoRecienAgregado() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(BuscarEmpleadoQuestion.compare()
                , Matchers.is(USUARIO)));
    }
}
