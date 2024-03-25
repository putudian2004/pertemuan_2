package latihan1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author diansariani
 * tgl : 2024-03-25
 */
public class Latihan2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
        
        String nama="";
        
        System.out.print("Tulis nama: ");
        
        try{
            nama = dtIN.readLine();
        }catch(IOException e){
            System.out.println("Terjadi masalah saat mengambil data");
        }
            System.out.println("Isi variabel nama : "+nama);
    }
}
