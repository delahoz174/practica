package com.co.practicaScreenplay_N2.stepsdefinitions;

import com.co.practicaScreenplay_N2.questions.AdministradorQuestion;
import com.co.practicaScreenplay_N2.tasks.AdministradorTask;
import com.co.practicaScreenplay_N2.userinterfaces.AdministradorPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static com.co.practicaScreenplay_N2.utils.Constantes.USUARIO;

public class AdministradorStepDefinition {


    @Cuando("^el usuario administrador autenticado ingrese a la opcion Admin$")
    public void elUsuarioAdministradorAutenticadoIngreseALaOpcionAdmin() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(AdministradorPage.MENU_ADMIN)
        );
    }

    @Y("^Presione el boton 'Agregar', complete el formulario y guarde la informacion$")
    public void presioneElBotonAgregarCompleteElFormularioYGuardeLaInformacion() {
        OnStage.theActorInTheSpotlight().attemptsTo(AdministradorTask.datosUsuario());

    }

    @Entonces("^el sistema debera mostrar un mensaje de exito indicando que el usuario fue creado correctamente$")
    public void elSistemaDeberaMostrarUnMensajeDeExitoIndicandoQueElUsuarioFueCreadoCorrectamente() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AdministradorQuestion.compare()
                , Matchers.is("System Users")));

    }
}


