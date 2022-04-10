/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overload;

import static java.time.Clock.system;

/**
 *
 * @author nabil
 */
public class BangunDatar {
    double luas;
    double a=0.5;
    
    void luas(double panjang, double lebar){
        luas = panjang*lebar;
        System.out.println("Luas pertama    = "+luas);
    }
    void luas(int panjang, int lebar, int a){
        luas = panjang*lebar*a;
        System.out.println("luas kedua      = "+luas);
    }
}
