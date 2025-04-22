package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    By botonIniciarSesion = By.id("loginButton");
    By inputDocumentos = By.id("documentUploadInput");
    By botonProcesar = By.id("processButton");
    By mensajeSlipSalida = By.id("slipSalidaMessage");
    By mensajeHistorial = By.id("historialMessage");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarSesion() {
        WebElement loginButton = driver.findElement(botonIniciarSesion);
        loginButton.click();
        // Asumimos que la sesión se inicia correctamente
    }

    public void cargarYProcesarDocumentos() {
        WebElement uploadInput = driver.findElement(inputDocumentos);
        uploadInput.sendKeys("path/to/documentos.zip");
        WebElement processButton = driver.findElement(botonProcesar);
        processButton.click();
    }

    public boolean validarGeneracionSlipSalida() {
        WebElement slipSalidaMessage = driver.findElement(mensajeSlipSalida);
        return slipSalidaMessage.isDisplayed() && slipSalidaMessage.getText().contains("Slip generado");
    }

    public boolean validarAlmacenamientoEnHistorial() {
        WebElement historialMessage = driver.findElement(mensajeHistorial);
        return historialMessage.isDisplayed() && historialMessage.getText().contains("Documentos guardados en historial");
    }
}