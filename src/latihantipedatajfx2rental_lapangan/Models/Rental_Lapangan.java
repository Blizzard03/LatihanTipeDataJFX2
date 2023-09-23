/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihantipedatajfx2rental_lapangan.Models;

import java.util.Date;

/**
 *
 * @author Muhamad Ariq Rasyid
 */
public class Rental_Lapangan {
    private double harga_sewa,total_hargasewa;
    private Date waktu_masuk,waktu_keluar = new Date();

    public double getHarga_sewa() {
        return harga_sewa;
    }

    public void setHarga_sewa(double harga_sewa) {
        this.harga_sewa = harga_sewa;
    }

    public double getTotal_hargasewa() {
        return total_hargasewa;
    }

    public void setTotal_hargasewa(double total_hargasewa) {
        this.total_hargasewa = total_hargasewa;
    }

    public Date getWaktu_masuk() {
        return waktu_masuk;
    }

    public void setWaktu_masuk(Date waktu_masuk) {
        this.waktu_masuk = waktu_masuk;
    }

    public Date getWaktu_keluar() {
        return waktu_keluar;
    }

    public void setWaktu_keluar(Date waktu_keluar) {
        this.waktu_keluar = waktu_keluar;
    }
    
    
}
