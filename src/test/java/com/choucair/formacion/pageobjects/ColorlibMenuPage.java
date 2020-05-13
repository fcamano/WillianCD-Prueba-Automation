package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class ColorlibMenuPage extends PageObject {

// Menu Forms de la pagina que consultamos
	@FindBy(xpath="//*[@id=\'menu\']/li[6]/a")
	public WebElementFacade menuForms;

// Sub Menu Forms General 
	@FindBy(xpath="//*[@id=\'menu\']/li[6]/ul/li[1]/a")
	public WebElementFacade  menuFormsGenerals;
	
// Sub Menu Forms Validacion
	@FindBy(xpath="//*[@id=\'menu\']/li[6]/ul/li[2]/a")
	public WebElementFacade menuFormsValidation;


 //Forms Validation - label informativo - Block Validation
	@FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/div/div/header/h5")
	public WebElementFacade lblFormsBlockValidation;
	
  public void menuFormBlockValidation(){
	menuForms.click();
	menuFormsValidation.click();
	String strMensaje = lblFormsBlockValidation.getText ();
	assertThat(strMensaje, containsString("Block Validation"));
		
}
}

