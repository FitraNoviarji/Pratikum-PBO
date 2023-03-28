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
    private int nomorPerhiasan ;
    private String namaperhiasan;
    private String jenis;
    private int Karat;
    private int Carat;
    private double Berat;
    private int emas;
    private int berlian;
    
    
    // constructor || ini juga digunakan untuk bisa menghubungan objek dan arraylist biar enak dipanggil
    public Perhiasan(int nomorPerhiasan, String namaperhiasan, String jenis, int Karat, double Berat){
        this.nomorPerhiasan = nomorPerhiasan ;
        this.namaperhiasan = namaperhiasan;
        this.jenis = jenis;
        this.Karat = Karat;
        this.Berat = Berat;
        this.Carat = Carat;
        this.emas = emas;
        this.berlian = berlian;

    }


    /**
     * @return the namaperhiasan
     */
    
    public int getNomorPerhiasan() {
    return nomorPerhiasan;
    }

    public void setNomorPerhiasan(int nomorPerhiasan) {
        this.nomorPerhiasan = nomorPerhiasan;
    }
    
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

    /**
     * @return the Carat
     */
    public int getCarat() {
        return Carat;
    }

    /**
     * @param Carat the Carat to set
     */
    public void setCarat(int Carat) {
        this.Carat = Carat;
    }

    /**
     * @return the emas
     */
    public int getEmas() {
        return emas;
    }

    /**
     * @param emas the emas to set
     */
    public void setEmas(int emas) {
        this.emas = emas;
    }

    /**
     * @return the berlian
     */
    public int getBerlian() {
        return berlian;
    }

    /**
     * @param berlian the berlian to set
     */
    public void setBerlian(int berlian) {
        this.berlian = berlian;
    }

    public void terdata(){
    System.out.print("Masukkan Nomor Perhiasan: " + this.getNomorPerhiasan());
    System.out.println("Nama Perhiasan : " + this.getNamaperhiasan());
    System.out.println("Jenis : " + this.getJenis());
    System.out.println("Karat : " + this.getKarat());
    System.out.println("Berat : " + this.getBerat());
    System.out.println("Emas : " + this.getEmas());
    System.out.println("Telah Terdata");
    System.out.print("\n");
    }


    

}
   
  



