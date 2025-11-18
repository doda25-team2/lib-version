package nl.tudelft.doda25.team2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class VersionUtil {
    private static final String VERSION_PROPERTIES_FILE = "version.properties";
    private static String version = null;

    /**
     * Gets the version of the application as specified in pom.xml
     * 
     * @return the version string, or "unknown" if it cannot be determined
     */
    public static String getVersion() {
        if (version == null) {
            version = loadVersion();
        }
        return version;
    }

    private static String loadVersion() {
        Properties properties = new Properties();
        try (InputStream inputStream = VersionUtil.class.getClassLoader()
                .getResourceAsStream(VERSION_PROPERTIES_FILE)) {
            if (inputStream != null) {
                properties.load(inputStream);
                return properties.getProperty("version", "unknown");
            } else {
                System.err.println("Unable to find " + VERSION_PROPERTIES_FILE);
                return "unknown";
            }
        } catch (IOException e) {
            System.err.println("Error reading version properties: " + e.getMessage());
            return "unknown";
        }
    }
}
