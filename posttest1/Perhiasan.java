/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest1;

/**
 *
 * @author asus
 */
public class Perhiasan {
        // property 
    String namaperhiasan;
    String jenis;
    int Karat;
    double Berat;
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Perhiasan(String namaperhiasan, String jenis, int Karat, double Berat){
        this.namaperhiasan = namaperhiasan;
        this.jenis = jenis;
        this.Karat = Karat;
        this.Berat = Berat;
    }

    // method
    public void registrasi(){
        System.out.println("Nama perhiasan  :" + this.namaperhiasan);
        System.out.println("Jenis           :" + this.jenis);
        System.out.println("Karat           :" + this.Karat);
        System.out.println("Berat           :" + this.Berat);
        System.out.println("Telah Terdata Di sistem");
    }
    
    public void terupdate(){
        System.out.println("Nama perhiasan  :" + this.namaperhiasan);
        System.out.println("Jenis           :" + this.jenis);
        System.out.println("Karat           :" + this.Karat);
        System.out.println("Berat           :" + this.Berat);
        System.out.println("Telah Terupdate Di sistem");
    }
}

