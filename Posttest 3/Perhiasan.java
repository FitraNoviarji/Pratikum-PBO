/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/
package com.mycompany.posttest2;

/**
 *
 * @author asus
 */
class Perhiasan {
        // property 
    private String namaperhiasan;
    private String jenis;
    private int Karat;
    private double Berat;
    
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Perhiasan(String namaperhiasan, String jenis, int Karat, double Berat){
        this.namaperhiasan = namaperhiasan;
        this.jenis = jenis;
        this.Karat = Karat;
        this.Berat = Berat;
    }
  
    /**
     * @return the namaperhiasan
     */
    public String getNamaperhiasan() {
        return namaperhiasan;
    }

    /**
     * @param namaperhiasan the namaperhiasan to set
     */
    public void setNamaperhiasan(String namaperhiasan) {
        this.namaperhiasan = namaperhiasan;
    }

    /**
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * @return the Karat
     */
    public int getKarat() {
        return Karat;
    }

    /**
     * @param Karat the Karat to set
     */
    public void setKarat(int Karat) {
        this.Karat = Karat;
    }

    /**
     * @return the Berat
     */
    public double getBerat() {
        return Berat;
    }

    /**
     * @param Berat the Berat to set
     */
    public void setBerat(double Berat) {
        this.Berat = Berat;
    }
    
     // method
    public void registrasi(){
        System.out.println("Nama perhiasan  :" + this.getNamaperhiasan());
        System.out.println("Jenis           :" + this.getJenis());
        System.out.println("Karat           :" + this.getKarat());
        System.out.println("Berat           :" + this.getBerat());
        System.out.println("Telah Terdata Di sistem");
    }
    
    public void terupdate(){
        System.out.println("Nama perhiasan  :" + this.getNamaperhiasan());
        System.out.println("Jenis           :" + this.getJenis());
        System.out.println("Karat           :" + this.getKarat());
        System.out.println("Berat           :" + this.getBerat());
        System.out.println("Telah Terupdate Di sistem");
    }
   
  
}


