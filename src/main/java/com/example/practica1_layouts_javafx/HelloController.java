package com.example.practica1_layouts_javafx;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.FlowPane;

import java.lang.module.ModuleDescriptor;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ScrollBar scrollRed;

    @FXML
    private ScrollBar scrollGreen;

    @FXML
    private ScrollBar scrollBlue;

    @FXML
    private TextField rojoTx;

    @FXML
    private TextField verdeTx;

    @FXML
    private TextField azulTx;
    @FXML
    private FlowPane fondo;

    @FXML
    private Label pickNegro;
    @FXML
    private Label pickGrisDark;
    @FXML
    private Label pickGris;
    @FXML
    private Label pickGrisLight;
    @FXML
    private Label pickBlanco;
    @FXML
    private Label pickMagenta;
    @FXML
    private Label pickAzul;
    @FXML
    private Label pickCian;
    @FXML
    private Label pickVerde;
    @FXML
    private Label pickAmarillo;
    @FXML
    private Label pickNaranja;
    @FXML
    private Label pickRojo;
    @FXML
    private Label pickRosa;

    @FXML
    protected void onColorPick(MouseEvent event){
        Label evento = (Label) event.getSource();
        fondo.setStyle(evento.getStyle());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        scrollRed.valueProperty().addListener(new ChangeListener<Number>() {
            DecimalFormat df = new DecimalFormat("0");

            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {

                int rojo = (int) scrollRed.getValue();

                rojoTx.setText(String.valueOf(rojo));
                fondo.setStyle("-fx-background-color: rgb(" + (int) scrollRed.getValue() + "," + (int) scrollGreen.getValue() + "," + (int) scrollBlue.getValue() + ");");

            }
        });
        scrollGreen.valueProperty().addListener(new ChangeListener<Number>() {
            DecimalFormat df = new DecimalFormat("0");

            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {

                int verde = (int) scrollGreen.getValue();

                verdeTx.setText(String.valueOf(verde));
                fondo.setStyle("-fx-background-color: rgb(" + (int) scrollRed.getValue() + "," + (int) scrollGreen.getValue() + "," + (int) scrollBlue.getValue() + ");");

            }
        });
        scrollBlue.valueProperty().addListener(new ChangeListener<Number>() {
            DecimalFormat df = new DecimalFormat("0");

            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {

                int azul = (int) scrollBlue.getValue();

                azulTx.setText(String.valueOf(azul));
                fondo.setStyle("-fx-background-color: rgb(" + (int) scrollRed.getValue() + "," + (int) scrollGreen.getValue() + "," + (int) scrollBlue.getValue() + ");");

            }
        });
    }
}