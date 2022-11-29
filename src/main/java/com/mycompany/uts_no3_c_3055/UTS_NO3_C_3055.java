/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_c_3055;

/**
 *
 * @author User
 * Novita Dwi Sabekti
 * 21103055
 * SI05C
 */

public class UTS_NO3_C_3055 {

    public static void main(String[] args) {
        
        AsistenPraktikum_3055 asprak = new AsistenPraktikum_3055("21103055", "Novita Dwi", "Sistem Informasi", 3.9, "Alpro", 4);
        
        asprak.tampilDataMhsAsprak_3055();
        asprak.totalPendapatan_3055();
        
        System.out.println(" ");
        StudentsStaff_3055 SS = new StudentsStaff_3055(1, 4, "21103056", "Maria Astri", "Sistem Informasi", 3.9);
        
        SS.tampilDataMhsSS_3055();
        SS.totalPendapatanSS_3055();
        
    }
}
