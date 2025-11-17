package constants;

import java.time.LocalDate;

public class FrameworkConstants {

    // Base folder for reports
    private static final String REPORT_PATH = "reports/extent/";

    // Automatically include today's date in report name
    public static final String EXTENT_REPORT = REPORT_PATH + "ExtentReport_" + LocalDate.now() + ".html";
}
