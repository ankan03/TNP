package fileHandling;

import java.io.*;
import java.util.Properties;

public class PropertiesFile {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        OutputStream outputStream = new FileOutputStream("myPropertiesFile.properties");
        properties.setProperty("name","Ankan Mukherjee");
        properties.setProperty("roll","1828049");
        properties.setProperty("college","KIIT University , Bhubaneswar");
        properties.store(outputStream,"my first Properties File");

        InputStream inputStream = new FileInputStream("myPropertiesFile.properties");
        properties.load(inputStream);
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("roll"));
        properties.list(System.out);

    }
}
