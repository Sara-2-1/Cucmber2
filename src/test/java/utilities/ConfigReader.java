package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static final Properties properties = new Properties();

    static {
        String path = "src/test/resources/configuration.properties";
        try (FileInputStream input = new FileInputStream(path)) {

            properties.load(input);
            System.out.println("✅ configuration.properties loaded successfully from: " + path);

        } catch (IOException e) {
            System.err.println("❌ Error loading configuration file at: " + path);
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        String value = properties.getProperty(key);

        if (value == null || value.trim().isEmpty()) {
            System.out.println("⚠️ Warning: Key '" + key + "' not found or empty in configuration.properties");
        }

        return value;
    }
}
