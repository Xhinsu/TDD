package com.northcoders.planetsApi.repository;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@Component
public class DbConfig {
    Properties properties = new Properties();

    public DbConfig() throws IOException {
        String configFilePath = "src/main/resources/application.properties";
        File configFile = new File(configFilePath);
        FileInputStream configFileReader = new FileInputStream(configFile);
        properties.load(configFileReader);
        configFileReader.close();
    }

    public String getUrl() {
        return properties.getProperty("db.url");
    }
}
