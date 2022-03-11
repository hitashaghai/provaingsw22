package p1;

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

    public static void main(String[] args) {
        Punto A = new Punto(1,1); //oggetto: punto specifico
        Punto B = new Punto(0,0);
    }
}
