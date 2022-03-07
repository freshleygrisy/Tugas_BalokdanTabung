/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_balokdantabung;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas_BalokdanTabung {

    /**
     * @param args the command line arguments
     */
    
    static Balok blk = new Balok();
    static Tabung tbg = new Tabung();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil1;
        int loop = 1;
        do{
            System.out.println("Tugas Menghitung Persegi, Lingkaran, Balok, dan Tabung");
            System.out.println("1. Balok");
            System.out.println("2. Tabung");
            System.out.println("3. exit");
            System.out.println("Masukkan Pilihan : ");
            pil1 = input.nextInt();
        
        if (pil1 == 1 ){
            System.out.print("Panjang : ");
            double panjang = input.nextDouble();
            System.out.print("Lebar : ");
            double lebar = input.nextDouble();
            System.out.print("Tinggi : ");
            double tinggi = input.nextDouble();
            blk.setLebar(lebar);
            blk.setPanjang(panjang);
            blk.setTinggi(tinggi);
            blk.luas();
            blk.keliling();
            blk.luasPermukaan();
            blk.volume();
            System.out.println("Keliling Persegi Panjang = " + blk.getKeliling());
            System.out.println("Luas Persegi Panjang = " + blk.getLuas());
            System.out.println("Luas permukaan Balok = " + blk.getLuasPermukaan());
            System.out.println("Volume Balok = " + blk.getVolume());
            System.out.println("Kembali ke menu utama 1/0 (1 = ya , 0 = tidak) ");
            loop = input.nextInt();
        }
            
        else if (pil1 == 2){
            System.out.print("Jari-jari : ");
            double r = input.nextDouble();
            System.out.print("Tinggi : ");
            double tinggi = input.nextDouble();
            tbg.setR(r);
            tbg.setTinggi(tinggi);
            tbg.keliling();
            tbg.luas();
            tbg.luasPermukaan();
            tbg.volume();
            System.out.println("Keliling Lingkaran = " + tbg.getKeliling());
            System.out.println("Luas Lingkaran = " + tbg.getLuas());
            System.out.println("Luas Permukaan Tabung = " + tbg.getLuasPermukaan());
            System.out.println("Volume Tabung = " + tbg.getVolume());
            System.out.println("Kembali ke menu utama 1/0 (1 = ya , 0 = tidak) ");
            loop = input.nextInt();
        }
        else {};
        }while(loop == 1);
       
   
    }
    
}
