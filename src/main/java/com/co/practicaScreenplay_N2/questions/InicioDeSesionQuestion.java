package com.co.practicaScreenplay_N2.questions;

import com.co.practicaScreenplay_N2.userinterfaces.InicioDeSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class InicioDeSesionQuestion implements Question<String> {

    private boolean credenciales;

    private InicioDeSesionQuestion(boolean isSuccessfulLogin) {
        this.credenciales = isSuccessfulLogin;
    }

    @Override
    public String answeredBy(Actor actor) {
        if (credenciales) {
            return Text.of(InicioDeSesionPage.LABEL_TITULO_PAGINA).viewedBy(actor).asString();
        } else {
            return Text.of(InicioDeSesionPage.MESSAGE_ERROR_CREDENCIALES).viewedBy(actor).asString();
        }
    }

    public static InicioDeSesionQuestion credencialesvalidas() {
        return new InicioDeSesionQuestion(true);
    }

    public static InicioDeSesionQuestion credencialesnovalidas() {
        return new InicioDeSesionQuestion(false);
    }
}
