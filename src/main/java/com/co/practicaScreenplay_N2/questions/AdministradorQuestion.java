package com.co.practicaScreenplay_N2.questions;

import com.co.practicaScreenplay_N2.userinterfaces.AdministradorPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class AdministradorQuestion implements Question <String>{
    @Override
    public String answeredBy(Actor actor){
        return Text.of(AdministradorPage.LABEL_SYSTEM_USERS).viewedBy(actor).asString();
    }

    public static AdministradorQuestion compare(){
        return new AdministradorQuestion();
    }
}
