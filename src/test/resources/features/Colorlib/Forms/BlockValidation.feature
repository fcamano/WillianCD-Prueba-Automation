#Author: your.email@your.domain.com

@RegresionBlock
Feature: Formulario Block Validation
  El usuario debe poder autenticarce en la pagina,
  El usuario debe poder ingresar al formulario los datos requeridos.
  Cada campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato.
  
   @CasoExitosoBlockValidation
  Scenario: Diligenciamiento exitoso del formulario Block Validation,
            no se presenta ningun mensaje de validacion.
    Given Auntentico en colorlib con usuario block "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation block
    When Diligencio Formulario Block Validation   
       |Required|Email                |Password1|Password2|Date      |Url                  |DigitsOnly|Range   |
       |Valor3  |valor3@mail.com      |valor3   |valor3   |02-01-2018|http://www.valor3.com|123456    |7       |       
    Then Verifico ingreso exitoso block
    
   @CasoFallidoBlockValidation
  Scenario: Diligenciamiento fallido del formulario Block Validation,
            se presenta un mensaje de validacion.
    Given Auntentico en colorlib con usuario block "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation block
    When Diligencio Formulario Block Validation   
       |Required|Email                |Password1|Password2|Date      |Url                  |DigitsOnly|Range   |
       |        |valor4@mail.com      |valor4   |valor4   |02-01-2018|http://www.valor4.com|123456    |8       |      
    Then Verifico que se presenta etiqueta fallida de los campos
    
   @CasoFallidoBlockValidationRange
  Scenario: Diligenciamiento fallido del Campo Range,
            se presenta un mensaje de validacion del campo range.
    Given Auntentico en colorlib con usuario block "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation block
    When Diligencio Formulario Block Validation   
       |Required|Email                |Password1|Password2|Date      |Url                  |DigitsOnly|Range   |
       |Valor5  |valor5@mail.com      |valor5   |valor5   |02-01-2018|http://www.valor5.com|123456    |2       |      
    Then Verifico que se presenta etiqueta fallida del campo range
    
    
    