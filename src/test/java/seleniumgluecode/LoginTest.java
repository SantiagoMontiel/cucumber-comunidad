package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.Navigation;
import pageObjects.Login;
import static java.lang.Thread.sleep;

public class LoginTest{

    Login pageLogin = Hooks.getPageLogin();
    Navigation navigator = Hooks.getNavigator();


    @Given("^El usuario se encuentra en la pagina de login$")
    public void el_usuario_se_encuentra_en_la_pagina_de_login() throws Throwable {
        navigator.navigate(pageLogin.getUrl());
        sleep(1000);
    }

    @When("^El usuario ingresa \"([^\"]*)\"$")
    public void el_usuario_ingresa(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^Hace click en Login$")
    public void hace_click_en_Login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^Se muestra el Onboarding del usuario logueado$")
    public void se_muestra_el_Onboarding_del_usuario_logueado() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        sleep(1000);
    }


}
