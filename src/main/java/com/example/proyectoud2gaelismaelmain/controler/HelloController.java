package com.example.proyectoud2gaelismaelmain.controler;

import com.example.proyectoud2gaelismaelmain.model.ConstructorsItem;
import com.example.proyectoud2gaelismaelmain.model.Conductor;
import com.example.proyectoud2gaelismaelmain.model.DriverStandingsItem;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private ComboBox<Integer> anos;

    @FXML
    private TableView<DriverStandingsItem> tabla;
    @FXML

    private TableColumn posicion;
    @FXML

    private TableColumn conductor;
    @FXML

    private TableColumn equipo;
    @FXML

    private TableColumn puntos;
    @FXML

    private TableColumn victorias;

    @FXML
    private TextField nombreFichero;

    String stringNombreFichero = new String();

    @FXML
    protected void mostrarTabla(){

        tabla.getItems().clear();
        ArrayList<DriverStandingsItem> lista = new ArrayList<>();
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/f1db","root","root");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from driverstandings as ds join drivers as d on d.driverId = ds.driverId\n" +
                    "\twhere raceId = (select max(raceId) from races where year = "+anos.getValue()+")\n" +
                    "    order by ds.position");
            while (resultSet.next()){

                ArrayList<ConstructorsItem> constructors = new ArrayList<>();
                Statement statement1 = connection.createStatement();
                ResultSet resultSet1 = statement1.executeQuery("select distinct c.* from results as r join constructors as c on r.constructorId = c.constructorId\n" +
                        "\twhere\n" +
                        "\t\tr.driverId = "+resultSet.getInt("driverID")+" and\n" +
                        "        r.raceId in (select raceId from races where year = "+anos.getValue()+");\n");

                while (resultSet1.next()){

                    ConstructorsItem constructorsItem = new ConstructorsItem(resultSet1.getString("nationality"),resultSet1.getString("name"),resultSet1.getInt("constructorId"),resultSet1.getString("url"));
                    constructors.add(constructorsItem);

                }

                Conductor driver = new Conductor(resultSet.getString("code"),resultSet.getInt("driverId"),resultSet.getInt("number"),resultSet.getString("nationality"),resultSet.getString("forename"),resultSet.getString("surname"),resultSet.getDate("dob").toLocalDate(),resultSet.getString("url"));
                DriverStandingsItem standingsItem = new DriverStandingsItem(resultSet.getInt("wins"),resultSet.getString("positionText"),driver,constructors,resultSet.getInt("position"),resultSet.getFloat("points"));
                tabla.getItems().add(standingsItem);

            }

            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
//        try {
//            for (DriverStandingsItem driver:lista){
//
//                tabla.getItems().add(driver);
//
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        anos.setItems(FXCollections.observableArrayList(1950,1951,1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018));

    }

    public void exportarJSON(ActionEvent actionEvent) {

        stringNombreFichero = nombreFichero.getText();
        ObjectMapper objectMapper = new ObjectMapper();
        ArrayList<DriverStandingsItem> exportars = new ArrayList<>();
        for (DriverStandingsItem exportar : tabla.getItems()){

            exportars.add(exportar);

        }
        try {
            objectMapper.writeValue(new File(stringNombreFichero + ".json"),exportars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void exportarXML(ActionEvent actionEvent) {

        stringNombreFichero = nombreFichero.getText();
        XmlMapper xmlMapper = new XmlMapper();
        ArrayList<DriverStandingsItem> exportars = new ArrayList<>();
        for (DriverStandingsItem exportar : tabla.getItems()){

            exportars.add(exportar);

        }
        try {
            xmlMapper.writeValue(new File(stringNombreFichero + ".xml"),exportars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void exportarTexto(ActionEvent actionEvent) {

        stringNombreFichero = nombreFichero.getText();

        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(stringNombreFichero + ".txt"));) {

            for (DriverStandingsItem exportar : tabla.getItems()) {
                escritor.write(String.valueOf(exportar));
                escritor.newLine();
            }
            System.out.println("Escritura realizada.");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }

    public void exportarBinario(ActionEvent actionEvent) {

        stringNombreFichero = nombreFichero.getText();

        try (ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(stringNombreFichero + ".bin"));) {
            for (DriverStandingsItem exportar : tabla.getItems()) {
                escritor.writeObject(exportar);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }


    }
}