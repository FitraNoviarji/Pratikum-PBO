/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest2;

/**
 *
 * @author asus
 */
public class Gold extends Perhiasan{

    private int Gold;

    public Gold  (String namaperhiasan, String jenis, int Karat, double Berat){
        super(namaperhiasan, jenis, Karat, Berat);
        this.Gold = Gold;
    }

    public int getJatahBagasi() {
        return Gold;
    }

    public void setJatahBagasi(int jatahBagasi) {
        this.Gold = Gold;
    }
}

