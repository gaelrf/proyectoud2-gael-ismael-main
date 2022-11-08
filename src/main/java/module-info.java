module com.example.proyectoud1gaelismael {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
//    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.dataformat.xml;
    requires mysql.connector.j;
    requires java.sql;

    opens com.example.proyectoud2gaelismaelmain to javafx.fxml;
    exports com.example.proyectoud2gaelismaelmain;

    opens com.example.proyectoud2gaelismaelmain.model;
    exports com.example.proyectoud2gaelismaelmain.model;

    exports com.example.proyectoud2gaelismaelmain.controler;
    opens com.example.proyectoud2gaelismaelmain.controler to javafx.fxml;
}