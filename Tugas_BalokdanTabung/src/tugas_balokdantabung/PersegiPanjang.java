/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_balokdantabung;

/**
 *
 * @author ASUS
 */
public class PersegiPanjang implements MenghitungBidang{
    double panjang, lebar, luas, keliling;
    
    @Override
    public void luas() {
       luas = panjang * lebar;
    }

    @Override
    public void keliling() {
       keliling = 2*(panjang + lebar);
    }

    public double getLuas()  {
        return luas;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getKeliling() {
        return keliling;
    }
    
    
    
}
