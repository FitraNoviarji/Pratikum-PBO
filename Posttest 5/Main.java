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
    static ArrayList<Gold> gold = new ArrayList<Gold>();
    static ArrayList<Diamond> diamond = new ArrayList<Diamond>();
    static ArrayList<Perhiasan> perhiasan = new ArrayList<Perhiasan>();

 
    public static void main(String[] args) throws IOException {
         while (true) {
             System.out.println("+++ PENDATAAN PERHIASAN EMAS / DIAMOND +++");
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
     public static void createhias() throws NumberFormatException, IOException{
        System.out.println("Masukan Tipe Perhiasan (1.Gold | 2.Diamond)");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukan nama :");
                String namaPerhiasan = br.readLine();
            
                System.out.print("Masukan Jenis :");
                String jenis = br.readLine();
          
                System.out.print("Masukan Karat :");
                int Karat = Integer.parseInt(br.readLine());
            
                System.out.print("Masukan Berat :");
                double Berat = Double.parseDouble(br.readLine());
            
                System.out.print("Masukkan kemurnian Gold : ");
                int emas = Integer.parseInt(br.readLine());
                           
                Gold newemas = new Gold  (namaPerhiasan, jenis, Karat, Berat, emas, "Gold");
                gold.add(newemas) ;
                newemas.isAdded();
                break ;
            case 2 :
                System.out.print("Masukan nama :");
                String namaPerhiasan1 = br.readLine();
            
                System.out.print("Masukan Jenis :");
                String jenis1 = br.readLine();
            
                System.out.print("Masukan carat :");
                int Carat = Integer.parseInt(br.readLine());
            
                System.out.print("Masukan Berat :");
                double Berat1 = Double.parseDouble(br.readLine());
            
                System.out.print("Masukkan kemurnian Diamond : ");
                int berlian = Integer.parseInt(br.readLine());
            
            
                Diamond newberlian = new Diamond(namaPerhiasan1, jenis1, Carat, Berat1, berlian, "Diamond");
                diamond.add(newberlian);
                newberlian.isAdded();
                break ;
                
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }                    
    }
     
//TAMPILKAN
     public static void readhias() throws NumberFormatException, IOException{
        System.out.println("Tammpilkan1 data");
        System.out.println("1. Gold");
        System.out.println("2. Diamond");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.println(" DATA Gold");
                for (int i = 0; i < gold.size(); i++){
                    System.out.println("Gold ke-" + (i+1));
                    gold.get(i).display();
                    System.out.println("\n");
                }
                break;

            case 2:
                System.out.println(" DATA Diamond");
                for (int i = 0; i < diamond.size(); i++) {
                    System.out.println("Dosen ke-" + (i+1));
                    diamond.get(i).display();
                    System.out.println("\n");
                }
                break;
            default:
                System.out.println("Pilihan tidak ada");
                break;
        }
    }

     public static void edithias() throws NumberFormatException, IOException {
        System.out.println("Pilih data");
        System.out.println("1. Gold | 2. Diamond");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan indeks gold : ");
                int idx = Integer.parseInt(br.readLine());
                
                if(idx <= gold.size() || idx > 0) {
                    System.out.print("Masukan nama Emas :");
                    String addnamaPerhiasan = br.readLine();
                    System.out.print("Masukan Jenis :");
                    String addjenis = br.readLine();
                    System.out.print("Masukan Karat :");
                    int addkarat = Integer.parseInt(br.readLine());
                    System.out.print("Masukan Berat :");
                    double addberat = Double.parseDouble(br.readLine());
                    System.out.print("Masukan Kemurnian emas :");
                    int addemas = Integer.parseInt(br.readLine());
                    System.out.print("Masukan ipk :");
                    gold.get(idx-1).setNamaperhiasan(addnamaPerhiasan);
                    gold.get(idx-1).setJenis (addjenis);
                    gold.get(idx-1).setKarat(addkarat);
                    gold.get(idx-1).setBerat(addberat);
                    gold.get(idx-1).setEmas(addemas);

                    
                    System.out.println("Data berhasil diedit!");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            case 2 :
                System.out.print("Masukkan indeks diamond : ");
                int idx1 = Integer.parseInt(br.readLine());
                
                if(idx1 <= gold.size() || idx1 > 0) {
                    System.out.print("Masukan nama diamond :");
                    String addnamaPerhiasan = br.readLine();
                    System.out.print("Masukan Jenis :");
                    String addjenis = br.readLine();
                    System.out.print("Masukan Carat :");
                    int addcarat = Integer.parseInt(br.readLine());
                    System.out.print("Masukan Berat :");
                    double addberat = Double.parseDouble(br.readLine());
                    System.out.print("Masukan Kemurnian berlian :");
                    int addemas = Integer.parseInt(br.readLine());
                    System.out.print("Masukan ipk :");
                    diamond.get(idx1-1).setNamaperhiasan(addnamaPerhiasan);
                    diamond.get(idx1-1).setJenis (addjenis);
                    diamond.get(idx1-1).setKarat(addcarat);
                    diamond.get(idx1-1).setBerat(addberat);
                    diamond.get(idx1-1).setEmas(addemas);

                    
                    System.out.println("Data berhasil diedit!");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            default:
                break;
        }
                
    }
                
 
     public static void hapushias() throws  NumberFormatException,IOException {
        System.out.println("Pilih data ");
        System.out.println("1. Gold | 2. Diamond");
        System.out.print("Masukan Pilihan : ");
        int pilihan = Integer.parseInt(br.readLine());
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan indeks gold : ");
                int idx = Integer.parseInt(br.readLine());
        
                if(idx <= gold.size() || idx > 0) {
                    gold.remove(idx - 1);
                    
                    System.out.println("Data berhasil dihapus!");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            case 2:
                System.out.print("Masukkan indeks diamond : ");
                int idx1 = Integer.parseInt(br.readLine());
        
                if(idx1 <= diamond.size() || idx1 > 0) {
                    diamond.remove(idx1 - 1);
                    
                    System.out.println("Data berhasil dihapus!");
                }else{
                    System.out.println("Data Tidak ada");
                }
                break;
            default:
                break;
        }

    }

}
   
