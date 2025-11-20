package utilities;

import com.aventstack.extentreports.ExtentTest;
import java.util.HashMap;
import java.util.Map;

public class ExtentTestManager {

    private static Map<Integer, ExtentTest> extentTestMap = new HashMap<>();

    public static ExtentTest getTest() {
        return extentTestMap.get((int) Thread.currentThread().getId());
    }

    public static void startTest(String testName) {
        ExtentTest test = ExtentManager.getInstance().createTest(testName);
        extentTestMap.put((int) Thread.currentThread().getId(), test);
    }
}
