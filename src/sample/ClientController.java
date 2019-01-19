package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ClientController {

    @FXML
    Button Spies;

    @FXML
    Button Turf;

    ClientThread clientThread;

    @FXML
    public void initialize() {
        clientThread = new ClientThread();
        clientThread.start();

    }
    public void Spies() {
        clientThread.Spies();

    }
    public void Turf() {
        clientThread.Turf();
    }
}
