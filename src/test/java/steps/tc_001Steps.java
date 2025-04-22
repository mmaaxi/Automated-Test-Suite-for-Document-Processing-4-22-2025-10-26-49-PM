package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page;

    @Given("Que el usuario está en la página de carga de documentos")
    public void que_el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        page = new tc_001Page(driver);
        page.openPage();
    }

    @When("Seleccionar opción 'cargar documentos'")
    public void seleccionar_opcion_cargar_documentos() {
        page.clickLoadDocumentsOption();
    }

    @Then("El sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opcion_para_carga_unica_y_carga_multiple() {
        page.verifySingleAndMultipleUploadOptions();
    }

    @When("Elegir 'carga en un solo archivo'")
    public void elegir_carga_en_un_solo_archivo() {
        page.selectSingleFileUpload();
    }

    @Then("Se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_unico_recuadro_para_subir_el_archivo() {
        page.verifySingleUploadBoxEnabled();
    }

    @When("Elegir 'cargar documentos por separado'")
    public void elegir_cargar_documentos_por_separado() {
        page.selectSeparateUploads();
    }

    @Then("Se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_multiples_recuadros_correspondientes_a_cada_documento_requerido() {
        page.verifyMultipleUploadBoxesDisplayed();
    }
}