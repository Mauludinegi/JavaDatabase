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
public class program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //insert
        barang pensil = new barang();
        pensil.insert("P001", "PENSIL 2B", 20, 2000);
        pensil.insert("P002", "SPIDOL", 50, 1500);
        
        barang buku = new barang();
        buku.insert("B001", "BUKU TULIS", 30, 2500);
        buku.insert("B002", "BUKU GAMBAR", 40, 3000);
    
        //Update
        pensil.update("P001", "Pensil 2B", 20, 2000);
        pensil.update("P002", "Spidol", 50, 1500);
        
        buku.update("B001", "Buku Tulis", 30, 2500);
        buku.update("B002", "Buku Gambar", 40, 3000);
        
        //delete
        pensil.delete("P001");
        buku.delete("B002");
    }
    
}
