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

    // Constructor
    public Diamond(int nomorPerhiasan, String namaperhiasan, String jenis, int Carat, double Berat, int berlian) {
        super(nomorPerhiasan, namaperhiasan, jenis, Carat, Berat);
        this.berlian = berlian;
    }

    // Getter dan Setter
    public int getBerlian() {
        return berlian;
    }

    public void setBerlian(int berlian) {
        this.berlian = berlian;
    }
}

