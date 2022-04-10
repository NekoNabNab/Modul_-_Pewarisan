/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overiding;

/**
 *
 * @author nabil
 */
public class Hitung {
 
    public static void main(String[] args) {
        BangunDatar bangundatar=new BangunDatar();
        
        Persegi Persegi = new Persegi();
        Persegi.sisi=8;
        
        PersegiPanjang perjang =new PersegiPanjang();
        perjang.lebar=11;
        perjang.panjang=2;
        
        
       bangundatar.luas();
       bangundatar.keliling();
       
       Persegi.luas();
       Persegi.keliling();
       
       perjang.luas();
       perjang.keliling();
        
    }
    
}

