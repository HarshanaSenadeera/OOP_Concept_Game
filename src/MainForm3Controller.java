import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainForm3Controller implements Initializable {
    public Label NameIdLable;
    public Label ScoreIdLable;
    public AnchorPane Windo3Id;

    public void PlayAgainOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) Windo3Id.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainForm.fxml"))));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        int a= PlayerAWeponStore.getAplayerScore();
        int b= PlayerBWeaponStore.getBplayerScore();
        if(b<a){
            NameIdLable.setText("A");
            ScoreIdLable.setText(String.valueOf(a));
        }else {
            NameIdLable.setText("B");
            ScoreIdLable.setText(String.valueOf(b));

        }
        PlayerAWeponStore.arrayList.clear();
        PlayerBWeaponStore.arrayList.clear();
        PlayerAWeponStore.total=0;
        PlayerBWeaponStore.total=0;
    }
}
