/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan18.kelipatan;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan Kelipatan
 */
public class PBOIF210119080Latihan18Kelipatan {

    public static Double kelipatan;
    public static void perulangan() {
        kelipatan = 3.5;
        for (int i = 1; i <= 10; i++) {
        System.out.println(i * kelipatan);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        perulangan();
    }
    
}