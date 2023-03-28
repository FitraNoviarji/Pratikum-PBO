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

    // Constructor
    public Gold(int nomorPerhiasan, String namaperhiasan, String jenis, int Karat, double Berat, int emas) {
        super(nomorPerhiasan, namaperhiasan, jenis, Karat, Berat);
        this.emas = emas;
    }

    // Getter dan Setter
    public int getEmas() {
        return emas;
    }

    public void setEmas(int emas) {
        this.emas = emas;
    }
}
    