package com.choucair.formacion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions (features = "src/test/resources/features/Colorlib/Forms/BlockValidation.feature", 
				    tags = "@RegresionBlock")

//@CucumberOptions (features = "src/test/resources/features/Colorlib/Forms/PopupValidation.feature", 
                  //tags = "@Regresion")

//@CucumberOptions (features = "src/test/resources/features/Nombre.feature", tags = "@CasoAlterno")
public class RunnerTags {

}
