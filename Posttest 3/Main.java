/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author asus
 */
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Perhiasan> perhiasan = new ArrayList<>();

 
    public static void main(String[] args) throws IOException {
         while (true) {
             System.out.println("+++ SIA VERSI LITE +++");
             System.out.println("1. Create");
             System.out.println("2. Read");
             System.out.println("3. Update");
             System.out.println("4. Delete");
             System.out.println("5. Exit");
             System.out.print("Masukan Pilihan :");
             int pilihan = Integer.parseInt(br.readLine());
             switch (pilihan) {
                 case 1:
                     createhias(); 
                     break;
                 case 2:
                     readhias();  
                     break;
                 case 3:
                     edithias();
                     break;
                 case 4:
                     hapushias();  
                     break;
                 case 5:
                     System.exit(0);
                     break;
                 default:
                     System.out.println("Pilihan tidak ada");
                     break;
             }
         }
     }
     
//BUAT BARU
     public static void createhias() throws IOException{
         System.out.print("Masukan nama :");
         String addnama = br.readLine();
         System.out.print("Masukan Jenis :");
         String addjenis = br.readLine();
         System.out.print("Masukan Karat :");
         int addKarat = Integer.parseInt(br.readLine());
         System.out.print("Masukan Berat :");
         double addBerat = Double.parseDouble(br.readLine());
         Perhiasan hiasanBaru = new Perhiasan(addnama, addjenis, addKarat, addBerat);

         perhiasan.add(hiasanBaru);
         hiasanBaru.registrasi();
     }
     
//TAMPILKAN
     public static void readhias() throws IOException{
         System.out.println(" DATA PERHIASAN");
         for (int i = 0; i < perhiasan.size(); i++){
            Perhiasan perhiasans = perhiasan.get(i);
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("Nama Perhiasan : " + perhiasans.getNamaperhiasan());
            System.out.println("Jenis : " + perhiasans.getJenis());
            System.out.println("Karat : " + perhiasans.getKarat());
            System.out.println("Berat : " + perhiasans.getBerat()); 
            System.out.println("\n");
         }
     }

     public static void edithias() throws IOException {
        System.out.print("Masukkan indeks Perhiasan : ");
        int idx = Integer.parseInt(br.readLine());

         if(idx <= perhiasan.size() || idx > 0) {
            System.out.print("Masukan nama :");
            String addnama = br.readLine();
            System.out.print("Masukan Jenis :");
            String addjenis = br.readLine();
            System.out.print("Masukan Karat :");
            int addKarat = Integer.parseInt(br.readLine());
            System.out.print("Masukan Berat :");
            double addBerat = Double.parseDouble(br.readLine());
            Perhiasan hiasanBaru = new Perhiasan(addnama, addjenis, addKarat, addBerat);
            perhiasan.set(idx - 1, hiasanBaru);
            
             System.out.println("Data berhasil diedit!");
         }else{
             System.out.println("Data Tidak ada");
         }
     }


     public static void hapushias() throws IOException {
         System.out.print("Masukkan indeks Perhiasan: ");
         int idx = Integer.parseInt(br.readLine());

         if(idx <= perhiasan.size() || idx > 0) {
             perhiasan.remove(idx - 1);
            
             System.out.println("Data berhasil dihapus!");
         }else{
             System.out.println("Data Tidak ada");
        }
    }
}
   
