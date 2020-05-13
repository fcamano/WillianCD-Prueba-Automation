package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class ColorlibFormBlockValidationPage extends PageObject {
	
  // Campo Required
    @FindBy(xpath="//*[@id=\'required2\']")	
    public WebElementFacade txtRequired2;
		
 // Campo Email
    @FindBy(xpath="//*[@id=\'email2\']")	
    public WebElementFacade txtEmail2;
    
 // Campo Password
    @FindBy(xpath="//*[@id=\'password2\']")	
    public WebElementFacade txtPasswo2;  
    
 // Campo Confirmacion de Password
    @FindBy(xpath="//*[@id=\'confirm_password2\']")	
    public WebElementFacade txtPassword2;
    
 // Campo date
    @FindBy(xpath="//*[@id=\'date2\']")	
    public WebElementFacade txtDate2;
    
 // Campo Url
    @FindBy(xpath="//*[@id=\'url2\']")	
    public WebElementFacade txtUrl2;
    
 // Campo Digito
    @FindBy(xpath="//*[@id=\'digits\']")	
    public WebElementFacade txtDigits2;
    
 // Campo Range
    @FindBy(xpath="//*[@id=\'range\']")	
    public WebElementFacade txtRange;
    
 // Campo Agree
    @FindBy(xpath="//*[@id=\'agree2\']")	
    public WebElementFacade txtAgree2;
    
  //Boton Validate
    @FindBy(xpath="//*[@id=\'block-validate\']/div[10]/input")	
    public WebElementFacade  btnValidate;
        
 // Etiqueta de error campo required
    @FindBy(xpath="//*[@id=\'required2-error\']")	
    public WebElementFacade Errorrequiered;

 // Error de campo range
    @FindBy(xpath="//*[@id=\"range-error\"]")	
    public WebElementFacade Camporange;
    
    public void required2(String datoPrueba){
    	txtRequired2.click();
    	txtRequired2.clear();
    	txtRequired2.sendKeys(datoPrueba);
    	}

    public void email2(String datoPrueba){
    	txtEmail2.click();
    	txtEmail2.clear();
    	txtEmail2.sendKeys(datoPrueba);
    	}
    
    public void password2(String datoPrueba){
    	txtPasswo2.click();
    	txtPasswo2.clear();
    	txtPasswo2.sendKeys(datoPrueba);
    	}

    public void confirme_password2(String datoPrueba){
    	txtPassword2.click();
    	txtPassword2.clear();
    	txtPassword2.sendKeys(datoPrueba);
    	}
    
    public void date2(String datoPrueba){
    	txtDate2.click();
    	txtDate2.clear();
    	txtDate2.sendKeys(datoPrueba);
    	}

    public void url2(String datoPrueba){
    	txtUrl2.click();
    	txtUrl2.clear();
    	txtUrl2.sendKeys(datoPrueba);
    	}
    
    public void digito(String datoPrueba){
    	txtDigits2.click();
    	txtDigits2.clear();
    	txtDigits2.sendKeys(datoPrueba);
    	}

    public void range(String datoPrueba){
    	txtRange.click();
    	txtRange.clear();
    	txtRange.sendKeys(datoPrueba);
    	}
    
    public void agree(){
    	txtAgree2.click();
//    	txtAgree2.clear();
    	}
    public void validate1() {
    	btnValidate.click();
    	
    }
    public void form_sin_errores() {
    	assertThat(Errorrequiered.isCurrentlyVisible(), is(false));
        }

   public void form_con_errores() {
	    assertThat(Errorrequiered.isCurrentlyVisible(), is(true));
       }

   public void form_con_error_campo_range() {
	   assertThat(Camporange.isCurrentlyVisible(), is(true));
	
       }

}   

