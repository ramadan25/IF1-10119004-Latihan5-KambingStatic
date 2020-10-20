/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan5.kambingglobal;

/**
 *
 * @author ENDOG
 * NAMA     : Muhamad Ramadan
 * KELAS    : IF 1
 * NIM      : 10119004
 * Deskripsi Program : Program ini berisi untuk menampilkan
 * value ke layar
 */
public class IF110119004Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    
    // Variabel jumlah kambing jadi variabel instance
    int jumlahKambing = 88;
    
    // method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " +jumlahKambing);
    }
    
   public void tambahKambing() {
       jumlahKambing = jumlahKambing + 5;
       System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
   }
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //meanampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //menambah satu kambing
        kambingSusu.tambahKambing();
        
        //menampilkan jumalh kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
