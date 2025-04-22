package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_010Page;

public class tc_010Steps {

    tc_010Page tcPage = new tc_010Page();

    @Given("El usuario ha iniciado sesión en el sistema")
    public void usuarioHaIniciadoSesion() {
        tcPage.iniciarSesion();
    }

    @When("El usuario completa la carga y procesamiento de documentos")
    public void cargaYProcesamientoDeDocumentos() {
        tcPage.cargarYProcesarDocumentos();
    }

    @Then("El sistema genera el 'Slip de salida'")
    public void validarGeneracionSlipSalida() {
        Assert.assertTrue(tcPage.validarGeneracionSlipSalida());
    }

    @Then("Los documentos originales y los datos extraídos son guardados en el historial de la solicitud")
    public void validarAlmacenamientoHistorial() {
        Assert.assertTrue(tcPage.validarAlmacenamientoEnHistorial());
    }
}