package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class DrinkController {

    @FXML
    Button matcha1, chai2, kombucha3, sprite4, wine5;

    Matcha matcha = new Matcha();
    Chai chai = new Chai();
    Kombucha kombucha = new Kombucha();
    Sprite sprite = new Sprite();
    Wine wine = new Wine();

    public void initialize() {

        matcha.setFeel("chalky");
        matcha.setTaste("bittery sweet");

        chai.setFeel("smooth");
        chai.setTaste("refreshing");

        kombucha.setFeel("smooth");
        kombucha.setTaste("like herbs");

        sprite.setFeel("fizzy");
        sprite.setTaste("like diabetes");

        wine.setFeel("smooth");
        wine.setTaste("bitter");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(matcha1)) {
            alert.setContentText("Matcha feels " + matcha.getFeel() + " and tastes " + matcha.getTaste());
        }

        if (sourceButton == chai2) {
            alert.setContentText("Chai feels " + chai.getFeel() + " and tastes " + chai.getTaste());
        }

        if (sourceButton == kombucha3) {
            alert.setContentText("Kombucha feels " + kombucha.getFeel() + " and tastes " + kombucha.getTaste());
        }

        if (sourceButton == sprite4) {
            alert.setContentText("Sprite feels" + sprite.getFeel() + " and tastes " + sprite.getTaste());
        }

        if (sourceButton == wine5) {
            alert.setContentText("Wine feels " + wine.getFeel() + " and tastes " + wine.getTaste());
        }
        alert.showAndWait();

    }
}