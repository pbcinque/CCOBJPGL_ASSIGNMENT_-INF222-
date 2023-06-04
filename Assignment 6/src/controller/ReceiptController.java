package controller;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class ReceiptController implements Initializable {
	
	@FXML
    ImageView img1, img2;
	
    @FXML
    private Label titleLabel, itemsLabel, totalLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize the receipt 
        titleLabel.setText("Receipt");
        itemsLabel.setText("Items:");
        totalLabel.setText("Total: $0.00");
    }

    // Method to update receipt with details and total amount
    public void updateReceipt(String items, double totalAmount) {
        itemsLabel.setText("Items: " + items);
        totalLabel.setText(String.format("Total: $%.2f", totalAmount));
    }
}

