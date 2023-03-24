/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author mhdri
 * 
 */
import java.util.Scanner;

public class ProjectMini {
    public static void main(String[] args){
        Scanner input = new
            Scanner(System.in);
                
                System.out.print("Masukkan Sebuah Angka = ");
                int angka = input.nextInt();
                
                if(angka %2 == 0){
                    System.out.println("Angka yang dimasukkan adalah angka genap!");
                }else {
                    System.out.println("Angka yang dimasukkan adalah angka ganjil!");
                }
    }
    
}
