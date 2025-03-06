package com.co.practicaScreenplay_N2.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AdministradorPage {


    public static final Target MENU_ADMIN = Target.the("Menú Admin en la barra de navegación")
            .locatedBy("//a[.//span[text()='Admin']]");

    public static final Target BUTTON_AGREGAR = Target.the("Botón para agregar usuario")
            .locatedBy("//button[text()=' Add ']");

    public static final Target DROPDOWN_ROL_USUARIO = Target.the("Desplegable de rol de usuario")
            .locatedBy("//div[text()='-- Select --']");

    public static final Target OPTION_ROL_USUARIO = Target.the("Opción de rol Admin en el desplegable")
            .locatedBy("//span[contains(text(), 'Admin') and ancestor::*[@role='option']]");

    public static final Target INPUT_NOMBRE_EMPLEADO = Target.the("Campo para ingresar nombre del empleado")
            .locatedBy("//input[@placeholder=\"Type for hints...\"]");

    public static final Target OPTION_NOMBRE_EMPLEADO = Target.the("Opción de nombre de empleado en el desplegable")
            .locatedBy("//form[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]");

    public static final Target DROPDOWN_ESTADO = Target.the("Desplegable de estado del usuario")
            .locatedBy("(//div[@class=\"oxd-select-text-input\"])[2]");

    public static final Target OPTION_ESTADO = Target.the("Opción Enabled en el desplegable de estado")
            .locatedBy("//span[contains(text(), 'Enabled') and ancestor::*[@role='option']]");

    public static final Target INPUT_USUARIO = Target.the("Campo de entrada para el username")
            .locatedBy("(//input[@class=\"oxd-input oxd-input--active\"])[2]");

    public static final Target INPUT_CONTRASENA = Target.the("Campo de entrada para la contraseña")
            .locatedBy("//form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");

    public static final Target INPUT_CONFIRMAR_CONTRASENA = Target.the("Campo de entrada para confirmar la contraseña")
            .locatedBy("//form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");

    public static final Target BUTTON_GUARDAR = Target.the("Botón para guardar los datos del usuario")
            .locatedBy("//button[@type='submit']");

    public static final Target LABEL_SYSTEM_USERS = Target.the("Etiqueta de validación 'System Users'")
            .locatedBy("//h5[contains(@class, 'oxd-text--h5')]");
}