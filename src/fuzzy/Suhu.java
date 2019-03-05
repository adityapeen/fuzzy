/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

/**
 *
 * @author lenovo
 */
public class Suhu {
    private double dingin, sejuk, normal, hangat, panas, x, derajat;
    
    public Suhu(){
        this.dingin = 15;
        this.sejuk = 20;
        this.normal = 25;
        this.hangat = 30;
        this.panas = 35;
        this.x = 25;
    }
    
    public double getSuhu(){
        return this.x;
    }
    public double getDingin(){
        return this.dingin;
    }
    public double getSejuk(){
        return this.sejuk;
    }
    public double getNormal(){
        return this.normal;
    }
    public double getHangat(){
        return this.hangat;
    }
    public double getPanas(){
        return this.panas;
    }
    
    public void setSuhu(double x){
        this.x = x;
    }
    public void setDingin(double x){
        this.dingin = x;
    }
    public void setSejuk(double x){
        this.sejuk = x;
    }
    public void setNormal(double x){
        this.normal = x;
    }
    public void setHangat(double x){
        this.hangat = x;
    }
    public void setPanas(double x){
        this.panas = x;
    }
    public double hiDingin(double x){
        if(x <= this.dingin){
            derajat = 1;
        }
        else if(x >= this.sejuk){
            derajat = 0;
        }
        else{
            derajat = (this.sejuk - x)/(this.sejuk - this.dingin);
        }
        return derajat;
    }
    
    public double hiSejuk(double x){
        if(x==this.sejuk){
            derajat = 1;
        }
        else if(x >= this.normal || x <= this.dingin){
            derajat = 0;
        }
        else if(x < this.sejuk){
            derajat = (x - this.dingin)/(this.sejuk - this.dingin);
        }
        else {
            derajat = (this.normal - x)/(this.normal - this.sejuk);
        }
        return derajat;
    }
    
    public double hiNormal(double x){
        if(x==this.normal){
            derajat = 1;
        }
        else if(x >= this.hangat || x <= this.sejuk){
            derajat = 0;
        }
        else if(x < this.normal){
            derajat = (x - this.sejuk)/(this.normal - this.sejuk);
        }
        else {
            derajat = (this.hangat - x)/(this.hangat - this.normal);
        }
        return derajat;
    }
    public double hiHangat(double x){
        if(x==this.hangat){
            derajat = 1;
        }
        else if(x >= this.panas || x <= this.normal){
            derajat = 0;
        }
        else if(x < this.hangat){
            derajat = (x - this.normal)/(this.panas - this.hangat);
        }
        else {
            derajat = (this.panas - x)/(this.panas - this.hangat);
        }
        return derajat;
    }
    
    public double hiPanas(double x){
        if(x >= this.panas){
            derajat = 1;
        }
        else if(x <= this.hangat){
            derajat = 0;
        }
        else{
            derajat = (x - this.hangat)/(this.panas - this.hangat);
        }
        return derajat;
    }
}
