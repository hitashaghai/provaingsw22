package model;

public class Model {
    private double dist;

    public void calcola(Punto p1, Punto p2){
        dist=p1.distanza(p2);
    }
    //no comment
    public double getdist(){
        return dist;
    }
}
