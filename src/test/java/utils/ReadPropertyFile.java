package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    public static String getRoutesFromPropertyFile(String key) throws IOException {

        FileInputStream fis = new FileInputStream(new File("src/test/resources/routes.properties"));

        Properties prop = new Properties();
        prop.load(fis);
        return prop.getProperty(key);
    }
}
