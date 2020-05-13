package com.choucair.formacion.steps;
import com.choucair.formacion.pageobjects.ColorlibLoginPage;
import com.choucair.formacion.pageobjects.ColorlibMenuPage;

import net.thucydides.core.annotations.Step;

public class PopupValidationSteps {

	ColorlibLoginPage colorlibLoginPage; 
	ColorlibMenuPage  colorlibMenuPage;
	
	@Step	
	public void login_colorlib(String strUsuario, String strPass) {
//       a. abrir navegador con la url de prueba 
		 colorlibLoginPage.open();
/*
		 b. ingresar usuario demo
		 c. ingresar password demo
		 d. Clic en boton Sign in  */
		 
		 colorlibLoginPage.IngresarDatos(strUsuario, strPass) ;
		 
//       e. verificar la Autentiacacion (Label en home)
		 colorlibLoginPage.VerificaHome();	 
	}	
	
    @Step
    public void ingresar_form_validation() {
    	colorlibMenuPage.menuFormBlockValidation();
    }
    
  
}
