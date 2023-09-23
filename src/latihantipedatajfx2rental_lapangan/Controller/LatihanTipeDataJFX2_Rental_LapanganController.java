/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package latihantipedatajfx2rental_lapangan.Controller;

import java.net.URL;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import latihantipedatajfx2rental_lapangan.Models.Rental_Lapangan;

/**
 *
 * @author Muhamad Ariq Rasyid
 */
public class LatihanTipeDataJFX2_Rental_LapanganController implements Initializable {

    Rental_Lapangan mdlrl = new Rental_Lapangan();
    //private int harga_raket, harga_lapangan, harga_pelatih;
    Locale Indonesia = new Locale("in", "ID");
    NumberFormat formater = NumberFormat.getCurrencyInstance(Indonesia);
    @FXML
    private TextField Check_in_Text;
    @FXML
    private TextField Checkout_text;
    @FXML
    private MenuItem Raket;
    @FXML
    private MenuItem Lapangan;
    @FXML
    private MenuItem Pelatih;
    @FXML
    private MenuItem Raket_dan_Pelatih;
    @FXML
    private MenuItem Lapangan_dan_Pelatih;
    @FXML
    private MenuItem Semua;
    @FXML
    private TextField Total_Price;
    @FXML
    private MenuButton Menu_item_Lisr;
    @FXML
    private MenuItem Raket_dan_Lapangan;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Raket_Click(ActionEvent event) {
        SimpleDateFormat wkt = new SimpleDateFormat("HH:mm:ss");
        try {
            mdlrl.setWaktu_masuk(wkt.parse(Check_in_Text.getText()));
            mdlrl.setWaktu_keluar(wkt.parse(Checkout_text.getText()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long swkt = Math.round((1.0 * (mdlrl.getWaktu_keluar().getTime() - mdlrl.getWaktu_masuk().getTime()) / 1000) / 3600);
        String waktu = String.valueOf(swkt);
        double jam = Double.parseDouble(waktu);
        mdlrl.setHarga_sewa(jam * 5000);
        Total_Price.setText(formater.format(mdlrl.getHarga_sewa()));
        Menu_item_Lisr.setText(Raket.getText());

    }

    @FXML
    private void Feild_Click(ActionEvent event) {
        SimpleDateFormat wkt = new SimpleDateFormat("HH:mm:ss");
        try {
            mdlrl.setWaktu_masuk(wkt.parse(Check_in_Text.getText()));
            mdlrl.setWaktu_keluar(wkt.parse(Checkout_text.getText()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long swkt = Math.round((1.0 * (mdlrl.getWaktu_keluar().getTime() - mdlrl.getWaktu_masuk().getTime()) / 1000) / 3600);
        String waktu = String.valueOf(swkt);
        double jam = Double.parseDouble(waktu);
        mdlrl.setHarga_sewa(jam * 100000);
        Total_Price.setText(formater.format(mdlrl.getHarga_sewa()));
        Menu_item_Lisr.setText(Lapangan.getText());

    }

    @FXML
    private void Coach_Click(ActionEvent event) {
        SimpleDateFormat wkt = new SimpleDateFormat("HH:mm:ss");
        try {
            mdlrl.setWaktu_masuk(wkt.parse(Check_in_Text.getText()));
            mdlrl.setWaktu_keluar(wkt.parse(Checkout_text.getText()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long swkt = Math.round((1.0 * (mdlrl.getWaktu_keluar().getTime() - mdlrl.getWaktu_masuk().getTime()) / 1000) / 3600);
        String waktu = String.valueOf(swkt);
        double jam = Double.parseDouble(waktu);
        mdlrl.setHarga_sewa(jam * 50000);
        Total_Price.setText(formater.format(mdlrl.getHarga_sewa()));
        Menu_item_Lisr.setText(Pelatih.getText());
    }

    @FXML
    private void Raket_and_Flied_click(ActionEvent event) {
        SimpleDateFormat wkt = new SimpleDateFormat("HH:mm:ss");
        try {
            mdlrl.setWaktu_masuk(wkt.parse(Check_in_Text.getText()));
            mdlrl.setWaktu_keluar(wkt.parse(Checkout_text.getText()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long swkt = Math.round((1.0 * (mdlrl.getWaktu_keluar().getTime() - mdlrl.getWaktu_masuk().getTime()) / 1000) / 3600);
        String waktu = String.valueOf(swkt);
        double jam = Double.parseDouble(waktu);
        mdlrl.setHarga_sewa(jam * 105000);
        Total_Price.setText(formater.format(mdlrl.getHarga_sewa()));
        Menu_item_Lisr.setText(Raket_dan_Lapangan.getText());
    }

    @FXML
    private void Racket_and_coach_click(ActionEvent event) {
        SimpleDateFormat wkt = new SimpleDateFormat("HH:mm:ss");
        try {
            mdlrl.setWaktu_masuk(wkt.parse(Check_in_Text.getText()));
            mdlrl.setWaktu_keluar(wkt.parse(Checkout_text.getText()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long swkt = Math.round((1.0 * (mdlrl.getWaktu_keluar().getTime() - mdlrl.getWaktu_masuk().getTime()) / 1000) / 3600);
        String waktu = String.valueOf(swkt);
        double jam = Double.parseDouble(waktu);
        mdlrl.setHarga_sewa(jam * 55000);
        Total_Price.setText(formater.format(mdlrl.getHarga_sewa()));
        Menu_item_Lisr.setText(Raket_dan_Pelatih.getText());
    }

    @FXML
    private void Feild_and_coach_click(ActionEvent event) {
        SimpleDateFormat wkt = new SimpleDateFormat("HH:mm:ss");
        try {
            mdlrl.setWaktu_masuk(wkt.parse(Check_in_Text.getText()));
            mdlrl.setWaktu_keluar(wkt.parse(Checkout_text.getText()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long swkt = Math.round((1.0 * (mdlrl.getWaktu_keluar().getTime() - mdlrl.getWaktu_masuk().getTime()) / 1000) / 3600);
        String waktu = String.valueOf(swkt);
        double jam = Double.parseDouble(waktu);
        mdlrl.setHarga_sewa(jam * 150000);
        Total_Price.setText(formater.format(mdlrl.getHarga_sewa()));
        Menu_item_Lisr.setText(Lapangan_dan_Pelatih.getText());
    }

    @FXML
    private void all_click(ActionEvent event) {
        SimpleDateFormat wkt = new SimpleDateFormat("HH:mm:ss");
        try {
            mdlrl.setWaktu_masuk(wkt.parse(Check_in_Text.getText()));
            mdlrl.setWaktu_keluar(wkt.parse(Checkout_text.getText()));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long swkt = Math.round((1.0 * (mdlrl.getWaktu_keluar().getTime() - mdlrl.getWaktu_masuk().getTime()) / 1000) / 3600);
        String waktu = String.valueOf(swkt);
        double jam = Double.parseDouble(waktu);
        mdlrl.setHarga_sewa(jam * 155000);

        Total_Price.setText(formater.format(mdlrl.getHarga_sewa()));
        Menu_item_Lisr.setText(Semua.getText());

    }

    @FXML
    private void Hapus_Buttons(ActionEvent event) {
        Total_Price.setText("");
        Check_in_Text.setText("");
        Checkout_text.setText("");
        Menu_item_Lisr.setText("Pilih Rental");

    }

    @FXML
    private void Keluar_Button(ActionEvent event) {
        System.exit(0);

    }

}
