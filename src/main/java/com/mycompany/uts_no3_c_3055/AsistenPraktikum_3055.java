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

public class AsistenPraktikum_3055 extends Mahasiswa_3055 {
    private String mkAsistensi_3055;
    private int jmlPertemuan_3055;

    public AsistenPraktikum_3055(String nim_3055, String nama_3055, String jurusan_3055, double ipk_3055, String mkAsistensi_3055, int jmlPertemuan_3055) {
        super(nim_3055, nama_3055, jurusan_3055, ipk_3055);
        this.mkAsistensi_3055 = mkAsistensi_3055;
        this.jmlPertemuan_3055 = jmlPertemuan_3055;
    }
    
    public double totalPendapatan_3055(){
        return jmlPertemuan_3055 * 50000;    
    }
    
    public void tampilDataMhsAsprak_3055(){
        System.out.println("DATA ASISTEN PRAKTIKUM");
        super.tampilDataMhs_3055();
        System.out.println("MK Asistensi        : "+mkAsistensi_3055);
        System.out.println("Jumlah Pertemuan  : "+jmlPertemuan_3055);
        System.out.println("Total Pendapatan    : "+totalPendapatan_3055());
    }
}
