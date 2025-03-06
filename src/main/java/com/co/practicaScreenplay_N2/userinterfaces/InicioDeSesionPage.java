package com.co.practicaScreenplay_N2.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class InicioDeSesionPage {

    public static final Target INPUT_USUARIO = Target.the("Campo de entrada para el nombre de usuario")
            .locatedBy("//input[@name='username']");

    public static final Target INPUT_CONTRASENA= Target.the("Campo de entrada para la contraseña")
            .locatedBy("//input[@name='password']");

    public static final Target BUTTON_INICIAR = Target.the("Botón para iniciar sesión")
            .locatedBy("//button[@type='submit']");

    public static final Target LABEL_TITULO_PAGINA = Target.the("Título de la página después de iniciar sesión")
            .locatedBy("//*[@id=\"app\"]//h6");

    public static final Target MESSAGE_ERROR_CREDENCIALES = Target.the("Mensaje de error en el inicio de sesión")
            .locatedBy("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']");
}
