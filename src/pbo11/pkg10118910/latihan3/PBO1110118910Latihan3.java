/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11.pkg10118910.latihan3;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Muhamad Syifa Amrulloh 
 * KELAS : PBO11K 
 * NIM   : 10118910
 *
 * Description Program : Program ini Penggunaan Scanner input
 */
public class PBO1110118910Latihan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Masukan Nama Anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah = "+ nama);
    }
    
}
