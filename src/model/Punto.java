package model;

import java.lang.Math;

//classe: concetto generico
public class Punto {
    //attributi
    private double x;
    private double y;

    //costruttore
    public Punto(double x, double y){
        this.x=x;
        this.y=y;
    }

    //distanza
    public double distanza(Punto p){
        double d;
        d=Math.sqrt(Math.pow((this.x-p.x),2)+Math.pow((this.y-p.y),2));
        return d;
    }


}








