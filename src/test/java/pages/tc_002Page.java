package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverManager;

public class tc_002Page {
    private WebDriver driver;
    private WebDriverWait wait;

    private By uploadInput = By.id("uploadFile");
    private By previewSection = By.id("filePreview");
    
    public tc_002Page() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, 20);
    }

    public void navigateToUploadPage() {
        driver.get("https://example.com/upload");
    }

    public void uploadFile(String fileName) {
        WebElement uploadElement = driver.findElement(uploadInput);
        uploadElement.sendKeys(System.getProperty("user.dir") + "/files/" + fileName);
    }

    public boolean isFileUploaded() {
        return driver.findElement(previewSection).isDisplayed();
    }

    public boolean isPreviewDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(previewSection));
        WebElement preview = driver.findElement(previewSection);
        return preview.getText().contains("file.pdf");
    }
}