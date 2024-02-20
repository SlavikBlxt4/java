package com.svalero.utils;
import java.util.Properties;

public class PropertiesClass {
        Properties properties = new Properties();
        public PropertiesClass() {
        properties.setProperty("user", Conectar.USER);
        properties.setProperty("password", Conectar.PASSWORD);
        properties.setProperty("ssl", String.valueOf(Conectar.ssl));
    }
        public static String getProperty(String string) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'getProperty'");
        }

}
