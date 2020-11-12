/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan49.biayaemaskawin;

 /**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Menghitung Total Bayar Emas Kawin
 *
 */
public class PBO10K10119901Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Biaya b = new Biaya();
        
        b.setBerat(15.7);
        b.setHarga(570000);
        
        System.out.println("Hendi akan membeli emas kawin sebagai mahar nikah nya dengan total seberat " + b.getBerat() + " gram. Jika harga 1 gram emas per bulan Oktober ini adalah Rp " + b.getHarga() + ". Berapa total bayar yang harus dikeluarkan oleh Hendi?");
        System.out.println("\n=====Hasil Perhitungan=====");
        System.out.println("Berat Emas Kawin = " + b.getBerat() + " gram");
        System.out.println("Harga per gram \t = Rp. " + b.getHarga());
        System.out.println("TOTAL BAYAR \t = Rp. " + b.hitungTotalBayar());
        System.out.println("\nJadi total bayar yang harus dikeluarkan oleh Hendi adalah Rp. " + b.hitungTotalBayar());
    
    }
    
}
