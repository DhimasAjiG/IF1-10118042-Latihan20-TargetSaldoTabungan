/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118042.latihan20.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * @author
 * Nama  : Dhimas Aji Ghairrahmat
 * Kelas : IF1
 * NIM   : 10118042
 * Deskripsi Program   : Program ini berisi program Untuk Menghitung berapa lama harus menabung agar saldo mencapai Rp.6.000.000
 */
public class IF110118042Latihan20TargetSaldoTabungan {
    
    public static void main(String[] args) {
       double saldo = 3500000;
       double bunga;
        
        //pembuat format rupiah
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        //perhitungan
        for (int i = 1;i<=12;i++){
            bunga = saldo * 0.08;
            saldo += bunga;
            if(saldo <= 6500000){
                System.out.printf("Saldo di bulan ke - " + i + " %s%n",rupiah.format(saldo) );
            }
            
        }
    }
    
}
