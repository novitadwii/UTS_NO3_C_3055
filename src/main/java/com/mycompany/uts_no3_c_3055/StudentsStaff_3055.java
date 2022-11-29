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

public class StudentsStaff_3055 extends Mahasiswa_3055 {
    private int unitKerja_3055, jamKerja_3055;

    public StudentsStaff_3055(int unitKerja_3055, int jamKerja_3055, String nim_3055, String nama_3055, String jurusan_3055, double ipk_3055) {
        super(nim_3055, nama_3055, jurusan_3055, ipk_3055);
        this.unitKerja_3055 = unitKerja_3055;
        this.jamKerja_3055 = jamKerja_3055;
    }
    
    public double totalPendapatanSS_3055(){
        return jamKerja_3055 * 30000;
    }
    
    public void tampilDataMhsSS_3055(){
        System.out.println("DATA STUDENTS STAFF");
        super.tampilDataMhs_3055();
        System.out.println("Unit Kerja       : "+unitKerja_3055);
        System.out.println("Jam Kerja        : "+jamKerja_3055);
        System.out.println("TotalPendapatan     : "+totalPendapatanSS_3055());
    }
}
