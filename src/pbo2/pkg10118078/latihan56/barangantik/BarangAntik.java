/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118078.latihan56.barangantik;

/**
 *
 * @author         
 * Nama     : Steven Danesswaralay
 * Kelas    : IF-2
 * Nim      : 10118078
 * Deskripsi Tugas : Umur Barang Antik
 */
public class BarangAntik {
    private final int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tampilUmur(){
        System.out.println("Umur Barang Antik ini adalah : " + umur + " tahun");
    }
}
