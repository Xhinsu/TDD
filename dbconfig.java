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

---------

    package com.northcoders.planetsApi.repository;

import com.northcoders.planetsApi.model.Planet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PlanetsRepository {

    @Autowired
    DbConfig dbConfig;

    public List<Planet> getAllPlanets() {
        String dbUrl = dbConfig.getUrl();
        List<Planet> planets = new ArrayList<>();

        try {
            Connection conn = DriverManager.getConnection(dbUrl);

            Statement st = conn.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM planets");

            while (resultSet.next()) {
                Planet planet = new Planet();
                planet.setId(resultSet.getLong("id"));
                planet.setPlanetName(resultSet.getString("planetName"));
                planet.setPlanetSize(resultSet.getLong("planetSize"));
                planet.setPlanetType(resultSet.getString("planetType"));
                planet.setDistanceToSun(resultSet.getLong("distanceToSun"));
                planet.setYearLength(resultSet.getLong("yearLength"));
                planet.setOrbitalCircumference(resultSet.getLong("orbitalCircumference"));
                planet.setMoons(resultSet.getString("moons"));

                planets.add(planet);

                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return planets;
    }

    public String savePlanet(Planet planet) {
        String dbUrl = dbConfig.getUrl();

        try {
            Connection conn = DriverManager.getConnection(dbUrl);

            String sqlInsert = """
                    INSERT INTO public.planets(
                    \tid, "planetName", "distanceToSun", "planetType", "planetSize", "yearLength", "orbitalCircumference", moons)
                    \tVALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?);""";
            PreparedStatement st = conn.prepareStatement(sqlInsert);
            st.setString(1, planet.getPlanetName());
            st.setLong(2, planet.getDistanceToSun());
            st.setString(3, planet.getPlanetType());
            st.setLong(4, planet.getPlanetSize());
            st.setLong(5, planet.getYearLength());
            st.setLong(6, planet.getOrbitalCircumference());
            st.setString(7, planet.getMoons());

            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return "Planet was not saved to the database";
        }

        return planet.getPlanetName() + " saved successfully";
    }

    public Planet getPlanetsById(Long id) {
        String dbUrl = dbConfig.getUrl();
        Planet planet = new Planet();
        try {
            Connection conn = DriverManager.getConnection(dbUrl);
            String sqlStatement = "SELECT * FROM planets WHERE id = ?";
            PreparedStatement st = conn.prepareStatement(sqlStatement);
            st.setLong(1, id);
            ResultSet resultSet = st.executeQuery();

            while (resultSet.next()) {
                planet.setId(resultSet.getLong("id"));
                planet.setPlanetName(resultSet.getString("planetName"));
                planet.setPlanetSize(resultSet.getLong("planetSize"));
                planet.setPlanetType(resultSet.getString("planetType"));
                planet.setDistanceToSun(resultSet.getLong("distanceToSun"));
                planet.setYearLength(resultSet.getLong("yearLength"));
                planet.setOrbitalCircumference(resultSet.getLong("orbitalCircumference"));
                planet.setMoons(resultSet.getString("moons"));

                conn.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return planet;
    }

    public String deletePlanet(Long id) {
        String dbUrl = dbConfig.getUrl();

        try {
            Connection conn = DriverManager.getConnection(dbUrl);

            String sqlDelete = "DELETE FROM planets WHERE id = ?" ;
            PreparedStatement st = conn.prepareStatement(sqlDelete);
            st.setLong(1, id);
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return "Planet was not deleted";
        }

        return String.format("Planet with id %d deleted successfully", id);
    }
}
