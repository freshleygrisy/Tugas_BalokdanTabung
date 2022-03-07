/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_balokdantabung;

/**
 *
 * @author ASUS
 */
public class Lingkaran implements MenghitungBidang{
    double r, luas, keliling;
    @Override
    public void luas() {
     luas = 3.14*r*r;
    }

    @Override
    public void keliling() {
     keliling = 2*3.14*r;
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    
    
}
