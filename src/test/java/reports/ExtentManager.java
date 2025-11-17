package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import constants.FrameworkConstants;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {
            extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.EXTENT_REPORT);
            spark.config().setReportName("Automation Test Report");
            spark.config().setDocumentTitle("Cucumber BDD Test Report");
            extent.attachReporter(spark);
        }
        return extent;
    }
}
