package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class tc_001Page {
    WebDriver driver;

    By loadDocumentsOption = By.id("loadDocuments");
    By singleFileUploadOption = By.id("singleFileUpload");
    By multiFileUploadOption = By.id("multiFileUpload");
    By singleUploadBox = By.id("singleUploadBox");
    By multipleUploadBoxes = By.className("uploadBox");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage() {
        driver.get("http://example.com/upload");
    }

    public void clickLoadDocumentsOption() {
        driver.findElement(loadDocumentsOption).click();
    }

    public void verifySingleAndMultipleUploadOptions() {
        driver.findElement(singleFileUploadOption).isDisplayed();
        driver.findElement(multiFileUploadOption).isDisplayed();
    }

    public void selectSingleFileUpload() {
        driver.findElement(singleFileUploadOption).click();
    }

    public void verifySingleUploadBoxEnabled() {
        WebElement uploadBox = driver.findElement(singleUploadBox);
        assert(uploadBox.isDisplayed() && uploadBox.isEnabled());
    }

    public void selectSeparateUploads() {
        driver.findElement(multiFileUploadOption).click();
    }

    public void verifyMultipleUploadBoxesDisplayed() {
        assert(driver.findElements(multipleUploadBoxes).size() > 1);
    }
}