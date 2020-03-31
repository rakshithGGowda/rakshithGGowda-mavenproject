package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
// some comments from branch1
public class ConfigFileReader {

    private static Properties properties;
    private final String propertyFilePath= "properties//config.properties";

//some differnt comments on the same configure java
    //branchwrk comments is diiferent and confilted in here..
    public ConfigFileReader(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public static String getBaseUri(){
        String driverPath = properties.getProperty("baseURI");
        if(driverPath!= null) return driverPath;
        else throw new RuntimeException("BaseURI not specified in the Configuration.properties file.");
    }


    public static String getEndPointUri1() {
        String endpoint = properties.getProperty("endpoint1");
        if(endpoint != null) return endpoint;
        else throw new RuntimeException("Endpoint not specified in the Configuration.properties file.");
    }
    public static String getEndPointUri2() {
        String url = properties.getProperty("endpoint2");
        if(url != null) return url;
        else throw new RuntimeException("Endpoint not specified in the Configuration.properties file.");
    }
    public static String getEndPointUri3() {
        String url = properties.getProperty("endpoint3");
        if(url != null) return url;
        else throw new RuntimeException("Endpoint not specified in the Configuration.properties file.");
    }
}
