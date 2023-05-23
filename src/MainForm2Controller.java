import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MainForm2Controller {
    public CheckBox T56IdA;
    public CheckBox TankIdA;
    public CheckBox PistolIdA;
    public CheckBox BombIdA;
    public CheckBox T56IdB;
    public CheckBox TankIdB;
    public CheckBox PistolIdB;
    public CheckBox BombIdB;
    public CheckBox MultiBabellIdA;
    public CheckBox MultiBarellIdB;
    public AnchorPane Window2Id;


    public void BattleStartOnAction(ActionEvent actionEvent) throws IOException {
        Stage window =(Stage) Window2Id.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainForm3.fxml"))));

    }


    public void T56OnActionA(ActionEvent actionEvent) {
        Weapon t56=new T56();
        int tempStoreData = t56.getScore();
        if (T56IdA.isSelected()) {
            countA++;
            t56.Shoot();
            PlayerAWeponStore.setValue(t56.getScore());
            tempStoreData =  t56.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + PlayerAWeponStore.arrayList.indexOf(tempStoreData));
            PlayerAWeponStore.arrayList.remove(PlayerAWeponStore.arrayList.indexOf(tempStoreData));
            countA--;
        }

        disableCheckBox();

    }

    public void TankOnActionA(ActionEvent actionEvent) {
        Weapon tank=new Tank();
        int tempStoreData = tank.getScore();
        if (TankIdA.isSelected()) {
            countA++;
            tank.Shoot();
            PlayerAWeponStore.setValue(tank.getScore());
            tempStoreData =  tank.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + PlayerAWeponStore.arrayList.indexOf(tempStoreData));
            PlayerAWeponStore.arrayList.remove(PlayerAWeponStore.arrayList.indexOf(tempStoreData));
            countA--;
        }

        disableCheckBox();

    }

    public void PistolOnAction(ActionEvent actionEvent) {
        Pistol pistol=new Pistol();
        int tempStoreData = pistol.getScore();
        if (PistolIdA.isSelected()) {
            countA++;
            pistol.Shoot();
            PlayerAWeponStore.setValue(pistol.getScore());
            tempStoreData =  pistol.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + PlayerAWeponStore.arrayList.indexOf(tempStoreData));
            PlayerAWeponStore.arrayList.remove(PlayerAWeponStore.arrayList.indexOf(tempStoreData));
            countA--;
        }

        disableCheckBox();
    }

    public void BombOnActionA(ActionEvent actionEvent) {
        Weapon bomb=new Bomb();
        int tempStoreData = bomb.getScore();
        if (BombIdA.isSelected()) {
            countA++;
            bomb.Shoot();
            PlayerAWeponStore.setValue(bomb.getScore());
            tempStoreData =  bomb.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + PlayerAWeponStore.arrayList.indexOf(tempStoreData));
            PlayerAWeponStore.arrayList.remove(PlayerAWeponStore.arrayList.indexOf(tempStoreData));
            countA--;
        }

        disableCheckBox();
    }

    public void T56OnActionB(ActionEvent actionEvent) {
        Weapon t56=new T56();
        int tempStoreData = t56.getScore();
        if (T56IdB.isSelected()) {
            countB++;
            t56.Shoot();
            PlayerBWeaponStore.setValue(t56.getScore());
            tempStoreData =  t56.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + PlayerBWeaponStore.arrayList.indexOf(tempStoreData));
            PlayerBWeaponStore.arrayList.remove(PlayerBWeaponStore.arrayList.indexOf(tempStoreData));
            countB--;
        }

        disableCheckBox();
    }

    public void TankOnActionB(ActionEvent actionEvent) {
        Weapon tank=new Tank();
        int tempStoreData = tank.getScore();
        if (TankIdB.isSelected()) {
            countB++;
            tank.Shoot();
            PlayerBWeaponStore.setValue(tank.getScore());
            tempStoreData =  tank.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + PlayerBWeaponStore.arrayList.indexOf(tempStoreData));
            PlayerBWeaponStore.arrayList.remove(PlayerBWeaponStore.arrayList.indexOf(tempStoreData));
            countB--;
        }

        disableCheckBox();
    }

    public void PistolOnActionB(ActionEvent actionEvent) {
        Weapon pistol=new Pistol();
        int tempStoreData = pistol.getScore();
        if (PistolIdB.isSelected()) {
            countB++;
            pistol.Shoot();
            PlayerBWeaponStore.setValue(pistol.getScore());
            tempStoreData =  pistol.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + PlayerBWeaponStore.arrayList.indexOf(tempStoreData));
            PlayerBWeaponStore.arrayList.remove(PlayerBWeaponStore.arrayList.indexOf(tempStoreData));
            countB--;
        }

        disableCheckBox();
    }

    public void BombOnActionB(ActionEvent actionEvent) {
        Weapon bomb=new Bomb();
        int tempStoreData = bomb.getScore();
        if (BombIdB.isSelected()) {
            countB++;
            bomb.Shoot();
            PlayerBWeaponStore.setValue(bomb.getScore());
            tempStoreData =  bomb.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + PlayerBWeaponStore.arrayList.indexOf(tempStoreData));
            PlayerBWeaponStore.arrayList.remove(PlayerBWeaponStore.arrayList.indexOf(tempStoreData));
            countB--;
        }

        disableCheckBox();
    }

    public void MyltiOnActionA(ActionEvent actionEvent) {
        Weapon multiBarrel=new MultiBarrel();
        int tempStoreData = multiBarrel.getScore();
        if (MultiBabellIdA.isSelected()) {
            countA++;
            multiBarrel.Shoot();
            PlayerAWeponStore.setValue(multiBarrel.getScore());
            tempStoreData =  multiBarrel.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + PlayerAWeponStore.arrayList.indexOf(tempStoreData));
            PlayerAWeponStore.arrayList.remove(PlayerAWeponStore.arrayList.indexOf(tempStoreData));
            countA--;
        }

        disableCheckBox();
    }

    public void MultiOnActionB(ActionEvent actionEvent) {
        Weapon multiBarrel=new MultiBarrel();
        int tempStoreData = multiBarrel.getScore();
        if (MultiBarellIdB.isSelected()) {
            countB++;
            multiBarrel.Shoot();
            PlayerBWeaponStore.setValue(multiBarrel.getScore());
            tempStoreData =  multiBarrel.getScore();
            System.out.println("tempStoreData" + tempStoreData);
        } else {
            System.out.println("tempStoreData" + tempStoreData);
            System.out.println("index" + PlayerBWeaponStore.arrayList.indexOf(tempStoreData));
            PlayerBWeaponStore.arrayList.remove(PlayerBWeaponStore.arrayList.indexOf(tempStoreData));
            countB--;
        }

        disableCheckBox();
    }

     int countA=0;
     int countB=0;
    public void disableCheckBox() {
        System.out.println(countA);
        if (countA == 3) {

            if (T56IdA.isSelected()) {
                T56IdA.setDisable(false);
            } else {
                T56IdA.setDisable(true);
            }
            if (TankIdA.isSelected()) {
                TankIdA.setDisable(false);
            } else {
                TankIdA.setDisable(true);
            }
            if (PistolIdA.isSelected()) {
                PistolIdA.setDisable(false);
            } else {
                PistolIdA.setDisable(true);
            }
            if (BombIdA.isSelected()) {
                BombIdA.setDisable(false);
            } else {
                BombIdA.setDisable(true);
            }
            if (MultiBabellIdA.isSelected()) {
                MultiBabellIdA.setDisable(false);
            } else {
                MultiBabellIdA.setDisable(true);
            }


        } else {
            T56IdA.setDisable(false);
            TankIdA.setDisable(false);
            PistolIdA.setDisable(false);
            BombIdA.setDisable(false);
            MultiBabellIdA.setDisable(false);

        }
        System.out.println(countB);
        if(countB==3){
            if(T56IdB.isSelected()){T56IdB.setDisable(false);}else {T56IdB.setDisable(true);}
            if(TankIdB.isSelected()){TankIdB.setDisable(false);}else {TankIdB.setDisable(true);}
            if(PistolIdB.isSelected()){PistolIdB.setDisable(false);}else {PistolIdB.setDisable(true);}
            if(BombIdB.isSelected()){BombIdB.setDisable(false);}else {BombIdB.setDisable(true);}
            if(MultiBarellIdB.isSelected()){MultiBarellIdB.setDisable(false);}else {MultiBarellIdB.setDisable(true);}

        }else {
            T56IdB.setDisable(false);
            TankIdB.setDisable(false);
            PistolIdB.setDisable(false);
            BombIdB.setDisable(false);
            MultiBarellIdB.setDisable(false);
        }
    }
}
