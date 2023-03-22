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
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static ArrayList<Perhiasan> perhiasan = new ArrayList<>();

 
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
         System.out.print("Masukan Tipe Perhiasan (1.Gold | 2.Diamond) :");
         int tipePerhiasan = Integer.parseInt(br.readLine());
         
        System.out.print("Masukkan Nomor Perhiasan: ");
        int nomorPerhiasan = Integer.parseInt(br.readLine());
        
        for (Perhiasan perhiasan : perhiasan ) {
            if (perhiasan.getNomorPerhiasan() == nomorPerhiasan) {
                System.out.println("Nomor Perhiasan Sudah Ada. Membatalkan Proses!");
                return;
            }
        }
            System.out.print("Masukan nama :");
            String namaPerhiasan = br.readLine();
            
            System.out.print("Masukan Jenis :");
            String jenis = br.readLine();
            
            System.out.print("Masukan Karat :");
            int Karat = Integer.parseInt(br.readLine());
            
            System.out.print("Masukan Berat :");
            double Berat = Double.parseDouble(br.readLine());
            
//            Perhiasan hiasanBaru = new Perhiasan(addnama, addjenis, addKarat, addBerat);

//            perhiasan.add(hiasanBaru);
//            hiasanBaru.registrasi(); 

        if (tipePerhiasan == 1) {
            System.out.print("Masukkan Gold : ");
            int emas = Integer.parseInt(br.readLine());
            
            Gold newPerhiasan = new Gold(nomorPerhiasan,namaPerhiasan, jenis, Karat, Berat, emas);
            perhiasan.add(newPerhiasan);
            System.out.println("Data Berhasil Ditambah!");
            
        } else if (tipePerhiasan == 2) {
            System.out.print("Masukkan Diamond : ");
            int berlian = Integer.parseInt(br.readLine());

            Diamond newPerhiasan = new Diamond(nomorPerhiasan, namaPerhiasan, jenis, Karat, Berat, berlian);
            perhiasan.add(newPerhiasan);
            System.out.println("Data Berhasil Ditambah!");
            
        } else {
            System.out.println("Tipe Perhiasan Invalid.");
        }
    }
     
//TAMPILKAN
     public static void readhias() throws NumberFormatException, IOException{
        System.out.print("Masukkan Nomor Perhiasan: ");
        int nomorPerhiasan = Integer.parseInt(br.readLine());
        System.out.println("======== DATA PERHIASAN ========");
        for (Perhiasan perhiasan : perhiasan) {
        if (perhiasan.getNomorPerhiasan() == nomorPerhiasan) {
            System.out.println("Nomor Perhiasan     : " + perhiasan.getNomorPerhiasan());
            System.out.println("Nama Perhiasan      : " + perhiasan.getNamaperhiasan());
            System.out.println("Jenis               : " + perhiasan.getJenis());
            System.out.println("Karat               : " + perhiasan.getKarat());
            System.out.println("Berat               : " + perhiasan.getBerat()); 
            System.out.println("\n");
         if (perhiasan instanceof Gold) {
                    Gold gold = (Gold) perhiasan;
                    System.out.println("Emas        : " + gold.getEmas());
                    return;
                } else if (perhiasan instanceof Diamond) {
                    Diamond diamond = (Diamond) perhiasan;
                    System.out.println("Diamond       : " + diamond.getBerlian());
                    return;
                }
            }
        }
        System.out.println("Perhiasan Tidak Ditemukan");
    }

     public static void edithias() throws NumberFormatException, IOException {
        System.out.print("Masukkan Nomor Perhiasan: ");
        int nomorPerhiasan = Integer.parseInt(br.readLine());
        for (Perhiasan perhiasan : perhiasan) {
            if (perhiasan.getNomorPerhiasan() == nomorPerhiasan) {
                System.out.print("Masukkan Nama Perhiasan Baru (Tekan Enter Untuk Skip): ");
                String namaperhiasanNew = br.readLine();
                if (!namaperhiasanNew.isEmpty()) {
                    perhiasan.setNamaperhiasan(namaperhiasanNew);
                }
                
                System.out.print("Masukkan Jenis Baru (Tekan Enter Untuk Skip): ");
                String jenisNew = br.readLine();
                if (!jenisNew.isEmpty()) {
                    perhiasan.setJenis(jenisNew);
                }
                
                System.out.print("Masukkan Karat Baru (Tekan Enter Untuk Skip): ");
                int karatNew = Integer.parseInt(br.readLine());
                if ( karatNew != 0) {
                    perhiasan.setKarat(karatNew);
                }
                
                System.out.print("Masukkan Berat Baru (Tekan Enter Untuk Skip): ");
                Double BeratNew = Double.parseDouble(br.readLine());
                if ( BeratNew != 0) {
                    perhiasan.setBerat(BeratNew);
                }
                
            if (perhiasan instanceof Gold) {
                    Gold gold = (Gold) perhiasan;
                    System.out.print("Masukkan Emas (Input 0 Untuk Skip): ");
                    int emasNew = Integer.parseInt(br.readLine());
                    if (emasNew != 0) {
                        gold.setEmas(emasNew);
                        System.out.println("Jadwal Berhasil Di Update!");
                        return;
                    }
            } else if (perhiasan instanceof Diamond) {
                    Diamond diamond = (Diamond) perhiasan;
                    System.out.print("Masukkan Diamond Baru (Tekan Enter Untuk Skip): ");
                    int berlianNew =Integer.parseInt(br.readLine());
                    
                    if (berlianNew != 0 ) {
                    diamond.setBerlian(berlianNew);
                    }
                System.out.println("Data Berhasil Di Update!");
                    return;
                }
              }
        }
        System.out.println("Perhiasan Tidak Ditemukan!.");
    }
                
 
     public static void hapushias() throws  NumberFormatException,IOException {
        System.out.print("Masukkan Nomor Perhiasan: ");
        int nomorPerhiasan = Integer.parseInt(br.readLine());
        for (int i = 0; i < perhiasan.size(); i++) {
            int nomorperhiasan = 0;
            if (perhiasan.get(i).getNomorPerhiasan() == nomorPerhiasan) {
                perhiasan.remove(i);
                System.out.println("Data Berhasil Dihapus.");
                return;
            }
        }
        System.out.println("Data Tidak Ditemukan.");


    }
}
   
