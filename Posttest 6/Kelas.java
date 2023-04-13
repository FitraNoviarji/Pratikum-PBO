/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.posttest2;

/**
 *
 * @author asus
 */
public class Kelas {
    protected String idKelas;
    protected String namaKelas;
    protected String namaperhiasan;
    
    public Kelas(String idKelas, String namaKelas, String namaDosen) {
        this.idKelas = idKelas;
        this.namaKelas = namaKelas;
        this.namaperhiasan = namaperhiasan;
    }

    public String getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(String idKelas) {
        this.idKelas = idKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getNamaDosen() {
        return namaperhiasan;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaperhiasan = namaperhiasan;
    }

    
}

