package com.co.practicaScreenplay_N2.tasks;

import com.co.practicaScreenplay_N2.userinterfaces.InicioDeSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InicioDeSesionTask implements Task {

    private final String username;
    private final String password;

    public InicioDeSesionTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static InicioDeSesionTask conCredenciales(String username, String password) {
        return instrumented(InicioDeSesionTask.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(InicioDeSesionPage.INPUT_USUARIO),
                Enter.theValue(password).into(InicioDeSesionPage.INPUT_CONTRASENA),
                Click.on(InicioDeSesionPage.BUTTON_INICIAR)

        );
    }
}
