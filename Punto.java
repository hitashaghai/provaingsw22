package p1;

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

    public static void main(String[] args) {
        Punto a = new Punto(1,1); //oggetto: punto specifico
        Punto b = new Punto(0,0);
        double dist = b.distanza(a);
        System.out.println("Distanza = ");
        System.out.println(dist);
    }
}
