/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest2;

/**
 *
 * @author asus
 */
public class Pembeli {
        // Atribut
    private int beli;
    final String status = "Pembeli" ;

    // Constructor
    public Pembeli(String nama,int Umur, String status, String username, String password) {
        super (nama, Umur);
        this.beli = beli;
    }

    // Getter dan Setter
    public int getBeli() {
        return beli;
    }

    public void setBeli(int beli) {
        this.beli = beli;
    }
    
    public String getStatus(){
        return status ;
    } 
}
