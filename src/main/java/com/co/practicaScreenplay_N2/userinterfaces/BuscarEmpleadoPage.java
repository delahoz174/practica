package com.co.practicaScreenplay_N2.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class BuscarEmpleadoPage {
    public static final Target INPUT_BUSCAR_USUARIO = Target.the("Campo de entrada para buscar usuario")
            .locatedBy("//form/div[1]/div/div[1]/div/div[2]/input");

    public static final Target BUTTON_BUSCAR = Target.the("Botón para buscar usuario")
            .locatedBy("//button[@type='submit']");

    public static final Target LABEL_BUSCAR_RESULTADO = Target.the("Etiqueta con el nombre del usuario encontrado")
            .locatedBy("//div[2]/div[1]/div[1]/div[2]/div[1]");
}
