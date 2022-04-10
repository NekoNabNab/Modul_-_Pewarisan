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
public class Pekerjaan extends Pekerjaan_Admin{
    public void Cetak(){
        System.out.println("Indetitas Pekerjaan");
        System.out.println("Pekerjaan       : "+super.pekerjaan);
        System.out.println("Gaji Normal     : "+super.gaji_normal);
        System.out.println("Gaji Besar      : "+super.gaji_besar);
    }
    public void Cetak(String nama, String kelamin, int nomor_pegawai){
        System.out.println("Identitas Pegawai");
        System.out.println("Nama            : "+nama);
        System.out.println("Kelamin         : "+kelamin);
        System.out.println("Nomor Pegawai   : "+nomor_pegawai);
    }
}
