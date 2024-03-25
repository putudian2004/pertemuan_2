package latihan1;

/**
 *
 * @author diansariani
 * tgl : 2024-03-25
 */

import javax.swing.JOptionPane;

public class msgbox {
    public static void main(String[] args){
        String nama = "";
        nama = JOptionPane.showInputDialog("Tulis Nama");
        
        System.out.println("Isi Variabel nama: "+nama);
    }
    
}
