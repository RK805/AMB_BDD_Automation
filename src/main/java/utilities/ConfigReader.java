package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    private static final Properties defaultProps = new Properties();

    private static String runtimeBrowser = null;
    private static String runtimeEnv = null;

    static {
        loadDefaultProperties();
    }

    private static void loadDefaultProperties() {
        try (InputStream input = ConfigReader.class.getClassLoader()
                .getResourceAsStream("testData.properties")) {
            if (input == null) {
                throw new RuntimeException("❌ testData.properties not found in classpath");
            }
            defaultProps.load(input);
        } catch (IOException e) {
            throw new RuntimeException("❌ Failed to load testData.properties: " + e.getMessage(), e);
        }
    }

    public static String get(String key) {
        String value = defaultProps.getProperty(key);
        if (value == null) {
            throw new RuntimeException("❌ Property '" + key + "' not found in testData.properties.");
        }
        return value;
    }

    public static int getInt(String key) {
        String value = get(key);
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            throw new RuntimeException("❌ Property '" + key + "' is not a valid integer: " + value, e);
        }
    }

    // Runtime browser/env overrides
    public static void setBrowser(String browser) {
        runtimeBrowser = browser;
    }

    public static String getBrowser() {
        return runtimeBrowser != null ? runtimeBrowser : get("browser");
    }

    public static void setEnvironment(String env) {
        runtimeEnv = env;
    }

    public static String getEnvironment() {
        return runtimeEnv != null ? runtimeEnv : get("environment");
    }

    public static String getUrl() {
        return get("url");
    }
}
