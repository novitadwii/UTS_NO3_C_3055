/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3055;

/**
 *
 * @author User
 * Novita Dwi Sabekti
 * 21103055
 * SI05C
 */

public class Mahasiswa_3055 {
    protected String nim_3055, nama_3055, jurusan_3055;
    protected double ipk_3055;

    public Mahasiswa_3055(String nim_3055, String nama_3055, String jurusan_3055, double ipk_3055) {
        this.nim_3055 = nim_3055;
        this.nama_3055 = nama_3055;
        this.jurusan_3055 = jurusan_3055;
        this.ipk_3055 = ipk_3055;
    }
    
    public void tampilDataMhs_3055(){
        System.out.println("NIM                 : "+nim_3055);
        System.out.println("Nama Mahasiswa      : "+nama_3055);
        System.out.println("Jurusan             :"+jurusan_3055);
        System.out.println("IPK                 :"+ipk_3055);
    }
    
}
