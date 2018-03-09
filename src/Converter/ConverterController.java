package Converter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * UI controller for events and initializing components.
 * @author Raksani Khunamas.
 */
public class ConverterController {
    @FXML
    TextField textfield1;
    @FXML
    TextField textfield2;
    @FXML
    private ComboBox<Length> combobox1;
    @FXML
    private ComboBox<Length> combobox2;

    /**
     * Convert a distance from one unit to another.
     */
    @FXML
    public void handleConvert(ActionEvent event) {
        // read values from textfield(s)
        try {
            Length unit1 = combobox1.getValue();
            Length unit2 = combobox2.getValue();
            if (event.getSource() == textfield1) {
                double text1 = Double.parseDouble(textfield1.getText()) * unit1.getValue() / unit2.getValue();
                textfield2.setText(text1 + "");
                textfield1.setStyle("-fx-border-color: none ;");
                textfield2.setStyle("-fx-border-color: none ;");
            } else {
                double Text2 = Double.parseDouble(textfield2.getText()) * unit2.getValue() / unit1.getValue();
                textfield1.setText(Text2 + "");
                textfield1.setStyle("-fx-border-color: none ;");
                textfield2.setStyle("-fx-border-color: none ;");
            }
        } catch (Exception e) {
            invalidInput();
        }


        //System.out.println("handleConvert converting "+text1); // perform the conversion and output the result
    }

    /**
     * To clear all the textfields and red border.
     * @param actionEvent
     */
    @FXML
    public void handleClear(ActionEvent actionEvent) {
        textfield1.setText("");
        textfield2.setText("");
        textfield1.setStyle("-fx-border-color: none ;");
        textfield2.setStyle("-fx-border-color: none ;");
    }

    /**
     * change border color to red in case of invalid input or no input.
     */
    @FXML
    public void invalidInput() {
        textfield1.setStyle("-fx-border-color: red ;");
        textfield2.setStyle("-fx-border-color: red ;");
    }

    /**
     * JavaFX calls the initialize() method of your controller when
     * it creates the UI form, after the components have been created
     * and @FXML annotated attributes have been set.
     * <p>
     * This is a hook to initialize anything your controller or UI needs.
     */

    @FXML
    public void initialize() {
        // This is for testing
        System.out.println("Running initialize");
        if (combobox1 != null) {
            combobox1.getItems().addAll(Length.values());
            combobox1.getSelectionModel().select(0); // select an item to show
        }
        if (combobox2 != null) {
            combobox2.getItems().addAll(Length.values());
            combobox2.getSelectionModel().select(1); // select an item to show
        }

    }


}