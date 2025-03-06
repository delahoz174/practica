package com.co.practicaScreenplay_N2.questions;

import com.co.practicaScreenplay_N2.userinterfaces.BuscarEmpleadoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class BuscarEmpleadoQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor){
        return Text.of(BuscarEmpleadoPage.LABEL_BUSCAR_RESULTADO).viewedBy(actor).asString();
    }

    public static BuscarEmpleadoQuestion compare(){
        return new BuscarEmpleadoQuestion();
    }
}
