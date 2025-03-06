package com.co.practicaScreenplay_N2.tasks;

import com.co.practicaScreenplay_N2.interactions.WaitElement;
import com.co.practicaScreenplay_N2.userinterfaces.BuscarEmpleadoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.co.practicaScreenplay_N2.utils.Constantes.USUARIO;

public class BuscarEmpleadoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(USUARIO).into(BuscarEmpleadoPage.INPUT_BUSCAR_USUARIO));
        actor.attemptsTo(Click.on(BuscarEmpleadoPage.BUTTON_BUSCAR));
        actor.attemptsTo(WaitElement.elementIsClickable(BuscarEmpleadoPage.LABEL_BUSCAR_RESULTADO,10));

    }

    public static BuscarEmpleadoTask SearchUsername(){
        return Tasks.instrumented(BuscarEmpleadoTask.class);
    }
}
