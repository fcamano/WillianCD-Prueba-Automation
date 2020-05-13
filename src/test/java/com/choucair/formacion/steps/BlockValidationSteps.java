package com.choucair.formacion.steps;

import java.util.List;

import com.choucair.formacion.pageobjects.ColorlibFormBlockValidationPage;

import net.thucydides.core.annotations.Step;

public class BlockValidationSteps {
  
ColorlibFormBlockValidationPage colorlibFormBlockValidationPage;

@Step
public void diligenciar_block_datos_tabla(List<List<String>> data, int i) {
	colorlibFormBlockValidationPage.required2(data.get(i).get(0).trim());
	colorlibFormBlockValidationPage.email2(data.get(i).get(1).trim());
	colorlibFormBlockValidationPage.password2(data.get(i).get(2).trim());
	colorlibFormBlockValidationPage.confirme_password2(data.get(i).get(3).trim());
	colorlibFormBlockValidationPage.date2(data.get(i).get(4).trim());
	colorlibFormBlockValidationPage.url2(data.get(i).get(5).trim());
	colorlibFormBlockValidationPage.digito(data.get(i).get(6).trim());
	colorlibFormBlockValidationPage.range(data.get(i).get(7).trim());
	colorlibFormBlockValidationPage.agree();
	colorlibFormBlockValidationPage.validate1();
			
}
    
@Step
public void verificar_ingreso_datos_formulario_exitoso_block() {
	colorlibFormBlockValidationPage.form_sin_errores();
}
@Step
public void verificar_ingreso_datos_formulario_con_errores_block() {
	colorlibFormBlockValidationPage.form_con_errores();
	
}
@Step
public void verificar_ingreso_datos_formulario_con_error_campo_range() {
	colorlibFormBlockValidationPage.form_con_error_campo_range();
	
}	
}
