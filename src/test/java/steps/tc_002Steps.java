package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_002Page;

public class tc_002Steps {
    tc_002Page uploadPage = new tc_002Page();

    @Given("El usuario está en la página de carga de archivos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeArchivos() {
        uploadPage.navigateToUploadPage();
    }

    @When("El usuario selecciona un archivo PDF/DOCX dentro del límite de 50 MB")
    public void elUsuarioSeleccionaUnArchivoValido() {
        uploadPage.uploadFile("file.pdf");
    }

    @Then("El archivo se carga exitosamente")
    public void elArchivoSeCargaExitosamente() {
        Assert.assertTrue(uploadPage.isFileUploaded());
    }

    @Then("Se muestra la vista previa del archivo incluyendo nombre, tamaño y tipo")
    public void seMuestraLaVistaPreviaDelArchivo() {
        Assert.assertTrue(uploadPage.isPreviewDisplayed());
    }
}