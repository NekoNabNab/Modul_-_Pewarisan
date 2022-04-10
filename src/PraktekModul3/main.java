/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PraktekModul3;

/**
 *
 * @author nabil
 */
public class main {
    public static void main(String[] args) {
        String nama="Diah",kelamin="Perempuan";
        int nomor_pegawai= 33333;
        Pekerjaan pekerja1=new Pekerjaan();
        pekerja1.Cetak(nama, kelamin, nomor_pegawai);
        pekerja1.Cetak();
}
}
