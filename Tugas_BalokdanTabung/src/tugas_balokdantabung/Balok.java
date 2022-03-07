/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_balokdantabung;

/**
 *
 * @author ASUS
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    double luasPermukaan, volume, tinggi;
    @Override
    public void luasPermukaan() {
        luasPermukaan = 2 *(panjang*lebar + panjang*tinggi + lebar*tinggi);
    }

    @Override
    public void volume() {
        volume = panjang*lebar*tinggi;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
}
