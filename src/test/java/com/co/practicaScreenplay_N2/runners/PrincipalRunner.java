package com.co.practicaScreenplay_N2.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/01_inicioDeSesion.feature",
                    "src/test/resources/features/02_administrador.feature",
                    "src/test/resources/features/03_buscarEmpleado.feature"},
        glue = "com.co.practicaScreenplay_N2.stepsdefinitions"
)

    public class PrincipalRunner {
    }