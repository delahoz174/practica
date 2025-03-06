package com.co.practicaScreenplay_N2.tasks;

import com.co.practicaScreenplay_N2.interactions.WaitElement;
import com.co.practicaScreenplay_N2.userinterfaces.AdministradorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.co.practicaScreenplay_N2.utils.Constantes.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class AdministradorTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(AdministradorPage.BUTTON_AGREGAR));
        actor.attemptsTo(Click.on(AdministradorPage.DROPDOWN_ROL_USUARIO));
        actor.attemptsTo(Click.on(AdministradorPage.OPTION_ROL_USUARIO));
        actor.attemptsTo(Enter.theValue(NOMBRE_EMPLEADO).into(AdministradorPage.INPUT_NOMBRE_EMPLEADO));
        actor.attemptsTo(
                WaitUntil.the(AdministradorPage.OPTION_NOMBRE_EMPLEADO, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(AdministradorPage.OPTION_NOMBRE_EMPLEADO)
        );
        actor.attemptsTo(Click.on(AdministradorPage.DROPDOWN_ESTADO));
        actor.attemptsTo(Click.on(AdministradorPage.OPTION_ESTADO));
        actor.attemptsTo(Enter.theValue(USUARIO).into(AdministradorPage.INPUT_USUARIO));
        actor.attemptsTo(Enter.theValue(CONTRASENA).into(AdministradorPage.INPUT_CONTRASENA));
        actor.attemptsTo(Enter.theValue(CONTRASENA).into(AdministradorPage.INPUT_CONFIRMAR_CONTRASENA));
        actor.attemptsTo(Click.on(AdministradorPage.BUTTON_GUARDAR));
        actor.attemptsTo(WaitElement.elementIsClickable(AdministradorPage.LABEL_SYSTEM_USERS,10));


    }

    public static AdministradorTask datosUsuario(){
        return Tasks.instrumented(AdministradorTask.class);
    }
}

