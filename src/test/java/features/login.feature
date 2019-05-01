#language es.
#Author: ssosa@baufest.com
#Keywords Summary : Crédito empresas
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

@login
Feature: Login
  Description: Como usuario quiero poderme loguear en el sitio con mi usuario y password

  @exitoso
  Scenario Outline: Login con usuario valido
    Given El usuario se encuentra en la pagina de login
    When El usuario ingresa "<usuario>"
    And Hace click en Login
    Then Se muestra el Onboarding del usuario logueado

    Examples:
      | usuario | password |
      | standard_user | secret_sauce |
