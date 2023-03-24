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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);   
      
      System.out.print("Masukkan merk mobil: ");
      String merk = scanner.nextLine();
      
      System.out.print("Masukkan tahun produksi mobil: ");
      int tahunProduksi = scanner.nextInt();
      
      scanner.nextLine();

        System.out.print("Masukkan warna mobil: ");
        String warna = scanner.nextLine();

        Mobil mobil = new Mobil(merk, tahunProduksi, warna);

        int pilihan;
        do {
            System.out.println("MENU:");
            System.out.println("1. Tambah kecepatan");
            System.out.println("2. Kurangi kecepatan");
            System.out.println("3. Info mobil");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nilai kecepatan yang ingin ditambahkan: ");
                    int nilaiTambah = scanner.nextInt();
                    mobil.tambahKecepatan(nilaiTambah);
                    break;
                case 2:
                    System.out.print("Masukkan nilai kecepatan yang ingin dikurangi: ");
                    int nilaiKurang = scanner.nextInt();
                    mobil.kurangiKecepatan(nilaiKurang);
                    break;
                case 3:
                    mobil.infoMobil();
                    break;
                case 4:
                    System.out.println("Terima kasih sudah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

            System.out.println();
        } while (pilihan != 4);
    }
}