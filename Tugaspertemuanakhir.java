/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuanakhir;

import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Tugaspertemuanakhir {
    public static void main(String[] args) {
        String awal = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
        
        // Menampilkan ke Layar
        System.out.println(awal);
        
        //
        System.out.println("========================================================================");
        
        // Menampilkan substring "JavaScript adalah bahasa pemrograman"
        System.out.println(awal.substring(0, 36));
        
        // Menampilkan lowercase dari substring "JavaScript adalah bahasa pemrograman"
        System.out.println(awal.substring(0, 36).toLowerCase());
        
        // Menampilkan uppercase dari string awal
        System.out.println(awal.substring(0, 36).toUpperCase());
        
        // Menampilkan substring "pemrograman"
        System.out.println(awal.substring(25, 36));
        
        // Menampilkan substring "tingkat tinggi dan dinamis"
        System.out.println(awal.substring(37));
    }
}