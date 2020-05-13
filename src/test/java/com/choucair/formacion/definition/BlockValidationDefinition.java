package com.choucair.formacion.definition;

import java.util.List;

import com.choucair.formacion.steps.BlockValidationSteps;
import com.choucair.formacion.steps.PopupValidationSteps;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BlockValidationDefinition {
	
	@Steps
	PopupValidationSteps popupValidationSteps;
	
	@Steps
	BlockValidationSteps blockValidationSteps;
	
	@Given("^Auntentico en colorlib con usuario block \"([^\"]*)\" y clave \"([^\"]*)\"$")
	public void auntentico_en_colorlib_con_usuario_y_clave(String Usuario, String Clave) {
		popupValidationSteps.login_colorlib(Usuario,Clave);
	}
		
	@Given("^Ingreso a la funcionalidad Forms Validation block$")
	public void ingreso_a_la_funcionalidad_Forms_Validation() {
		popupValidationSteps.ingresar_form_validation();
	}
	
	 @When("^Diligencio Formulario Block Validation$")
	public void diligencio_Formulario_Block_Validation(DataTable dtDatosForm ) {
		List<List<String>> data = dtDatosForm.raw();
		
		for(int i=1; i<data.size(); i++){
			blockValidationSteps.diligenciar_block_datos_tabla(data, i);
            try {
            	Thread.sleep(6000);
            	
            }catch(InterruptedException e) {}
		}				
	}

	@Then("^Verifico ingreso exitoso block$")
	public void verifico_ingreso_exitoso_block() {
	blockValidationSteps.verificar_ingreso_datos_formulario_exitoso_block();
	} 
	
	@Then("^Verifico que se presenta etiqueta fallida de los campos$")
	public void verifico_ingreso_fallido_block() {
	blockValidationSteps.verificar_ingreso_datos_formulario_con_errores_block();
	} 
	
	@Then("^Verifico que se presenta etiqueta fallida del campo range$")
	public void verifico_ingreso_fallido_block_campo_range() {
	blockValidationSteps.verificar_ingreso_datos_formulario_con_error_campo_range();
	} 
}	

