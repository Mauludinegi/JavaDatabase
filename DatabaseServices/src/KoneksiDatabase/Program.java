/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KoneksiDatabase;

/**
 *
 * @author GIE
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        barang buku = new barang();
        
        //insert
        buku.insert("B003", "BUKU TULIS", 60, 2000);
        buku.insert("B004", "BUKU KERJA", 30, 7500);
        
        //update
        buku.update("B003", "PENSIL 2B", 30, 1750);
        buku.update("B004", "PENGGARIS", 15, 1000);
        
        //delete
        buku.delete("B001");
    }
    
}
