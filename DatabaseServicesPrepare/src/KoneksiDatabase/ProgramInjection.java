package KoneksiDatabase;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GIE
 */
public class ProgramInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        barang barang = new barang();
        barang.delete("B001 OR 'egi'='egi");
    }
    
}
