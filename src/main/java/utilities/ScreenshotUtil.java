package utilities;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil  {

    /**
     * Take screenshot and save inside:
     * reports/screenshots/yyyy-MM-dd/testName_timestamp.png
     */
    public static String takeScreenshot(WebDriver driver, String testName) {

        // Date folder: 2025-01-18
        String dateFolder = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String folderPath = "reports/screenshots/" + dateFolder + "/";

        // Create folder if not exists
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        // Unique screenshot name: testName_20250118_103015.png
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String filePath = folderPath + testName + "_" + timestamp + ".png";

        try {
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File dest = new File(filePath);
            Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return filePath;
        } catch (IOException e) {
            System.out.println("❌ Failed to capture screenshot: " + e.getMessage());
            return null;
        }
    }
}
