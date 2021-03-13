package lab7_angelponce;

public class Planetas {
    
    private String nombre; 
    private double distancia; //que hay entre dicho lugar y la tierra (en kilómetros)
    private String superficie; //tipo de superficie (rocosa, líquida o gasesosa)
    private int saturaciondeoxigeno; // (0 – 100).

    public Planetas() {
    }

    public Planetas(String nombre, double distancia, String superficie, int saturaciondeoxigeno) {
        this.nombre = nombre;
        this.distancia = distancia;
        this.superficie = superficie;
        this.saturaciondeoxigeno = saturaciondeoxigeno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public int getSaturaciondeoxigeno() {
        return saturaciondeoxigeno;
    }

    public void setSaturaciondeoxigeno(int saturaciondeoxigeno) {
        this.saturaciondeoxigeno = saturaciondeoxigeno;
    }

    @Override
    public String toString() {
        return nombre + ", distancia: " + distancia;
    }
    
    
    
}
