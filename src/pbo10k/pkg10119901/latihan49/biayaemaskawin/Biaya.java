/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan49.biayaemaskawin;

/**
 *
 * @author User
 */
public class Biaya 
{
    private double berat;
    private int harga;
    
    public double getBerat()
    {
        return berat;
    }
    
    public void setBerat(double berat)
    {
        this.berat = berat;
    }
    
    public int getHarga()
    {
        return harga;
    }
    
    public void setHarga(int harga)
    {
        this.harga = harga;
    }
    
    public int hitungTotalBayar()
    {
        return (int) (berat * harga);
    }
}
