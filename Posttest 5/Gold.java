/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest2;

/**
 *
 * @author asus
 */
class Gold extends Perhiasan {
    // Atribut
    private int emas;
    final String status = "Gold" ;

    // Constructor
    public Gold(String namaperhiasan, String jenis, int Karat, double Berat, int emas, String status) {
        super( namaperhiasan, jenis, Karat, Berat);
        this.emas = emas;
    }

    // Getter dan Setter
    public int getEmas() {
        return emas;
    }

    public void setEmas(int emas) {
        this.emas = emas;
    }
    
    public String getStatus(){
        return status ;
    } 

    @Override
    public void isAdded() {
        System.out.println("Gold baru dengan nama " + this.namaperhiasan);
        System.out.println("Dengan Jenis " + this.jenis);
        System.out.println("Dengan Karat " + this.Karat);
        System.out.println("Dengan Berat " + this.Berat);
        System.out.println("Dengan Dengan kemurnian emas " + this.emas);
        System.out.println("Berhasil ditambahkan");
    }
    
    @Override
    public void display(){
        System.out.println("Nama: " + this.namaperhiasan);
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Karat: " + this.Karat);
        System.out.println("Berat: " + this.Berat);
        System.out.println("Kemurnian Emas: " + this.emas);
        System.out.println("Status: " + this.status);
    }
}
    