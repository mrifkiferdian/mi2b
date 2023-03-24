/*
 * To change this license header, choose License Headers in Tugas1 Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author mhdri
 */
import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int harga_barang, jumlah_barang, total_bayar;
        String nama_barang;
        
        System.out.print("Nama Barang: ");
        nama_barang = input.nextLine();
        System.out.print("Harga Barang: ");
        harga_barang = input.nextInt();
        System.out.print("Jumlah Barang: ");
        jumlah_barang = input.nextInt();
        
        total_bayar = harga_barang * jumlah_barang;
        
        System.out.println("Total Bayar: Rp " + total_bayar);
    }
}