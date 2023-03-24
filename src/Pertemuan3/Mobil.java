/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author mhdri
 */
public class Mobil {
    private String merk;
    private int tahunProduksi;
    private String warna;
    private int kecepatan;
    
    public Mobil(String merk, int tahunProduksi, String warna) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.warna = warna;
        this.kecepatan = 0;
}
    public String getMerk() {
        return merk;    
    }
    
public int getTahunProduksi() {
        return tahunProduksi;
    }

    public String getWarna() {
        return warna;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void tambahKecepatan(int nilai) {
        if (kecepatan + nilai > 200) {
            kecepatan = 200;
        } else {
            kecepatan += nilai;
        }
    }
    
 public void kurangiKecepatan(int nilai) {
        if (kecepatan - nilai < 0) {
            kecepatan = 0;
        } else {
            kecepatan -= nilai;
        }
    }

    public void infoMobil() {
        System.out.println("Merk Mobil: " + merk);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Warna Mobil: " + warna);
        System.out.println("Kecepatan Mobil: " + kecepatan + " km/jam");
    }
}
    