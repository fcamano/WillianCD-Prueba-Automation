#Author: your.email@your.domain.com

@Regresion
Feature: Formulario Popup Validation 
  El usuaio debe poder ingresar al formulario los datos requeridos.
  Cad campo del formulario realiza validaciones de obligatoriedad,
  longitud y formato, el sistema debe presentar las validaciones respectivas
  para cada campos a traves un globo informativo.

  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario Popup Valitation,
            no se presenta ningun mensaje de validacion.
    Given Auntentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio Formulario Popup Validation   
      |Required|Select|Multiples1|Multiples2|Url                  |Email          |Password1|Password2|Minsize|Maxsize|Number|IP         |Date      |DateEarlier|
      |Valor2  |Golf  |Tennis     |Golf     |http://www.valor1.com|valor1@mail.com|valor1   |valor1   |123456 |123456 |-99.99|200.200.5.4|2018-01-22|2012/09/12 |
    Then Verifico ingreso exitoso
   
  @CasoAlterno
  Scenario: Diligenciamiento con errores del formulario Popup Valitation,
            Se presenta Globo Informativo indicando error en el diligenciamiento de algunos de los campos.
    Given Auntentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad Forms Validation
    When Diligencio Formulario Popup Validation   
      |Required|Select|Multiples1|Multiples2|Url                  |Email          |Password1|Password2|Minsize|Maxsize|Number|IP         |Date      |DateEarlier|
      |        |Golf          |Tennis     |Golf     |http://www.valor1.com|valor1@mail.com|valor1   |valor1   |123456 |123456 |-99.99|200.200.5.4|2018-01-22|2012/09/12 |
      |Valor5  |Choose a sport|Tennis     |Golf     |http://www.valor1.com|valor1@mail.com|valor1   |valor1   |123456 |123456 |-99.99|200.200.5.4|2018-01-22|2012/09/12 |
    Then Verificar que se presente Globo Informativo de validacion
    
    
    