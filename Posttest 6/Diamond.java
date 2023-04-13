/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest2;

/**
 *
 * @author asus
 */
class Diamond extends Perhiasan {
    // Atribut
    private int berlian;
    final String status = "Diamond" ;

    // Constructor
    public Diamond(String namaperhiasan, String jenis, int Carat, double Berat, int berlian, String status) {
        super (namaperhiasan, jenis, Carat, Berat);
        this.berlian = berlian;
    }

    // Getter dan Setter
    public int getBerlian() {
        return berlian;
    }

    public void setBerlian(int berlian) {
        this.berlian = berlian;
    }
    
    public String getStatus(){
        return status ;
    } 

        @Override
    public void isAdded() {
        System.out.println("Gold baru dengan nama " + this.getNamaperhiasan());
        System.out.println("Dengan Jenis " + this.getJenis());
        System.out.println("Dengan Carat " + this.getCarat());
        System.out.println("Dengan Berat " + this.getBerat());
        System.out.println("Dengan Dengan kemurnian Berlian " + this.berlian);
        System.out.println("Berhasil ditambahkan");
    }
    
    @Override
    public void display(){
        System.out.println("Nama: " + this.getNamaperhiasan());
        System.out.println("Jenis: " + this.getJenis());
        System.out.println("Carat: " + this.getCarat());
        System.out.println("Berat: " + this.getBerat());
        System.out.println("Kemurnian Berlian: " + this.berlian);
        System.out.println("Status: " + this.status);
    }
}

