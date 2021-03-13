package lab7_angelponce;

public class Naves {
    
    private String Nombre, identificador;
    private int cantidadmaximapersonas,tiempo; // de despegue
    private int astronautas; // que lleva a bordo, 
    private int tiempodeaterrizaje; 
    private double velocidad; //en km/h 
    private double distanciamaxima; // a la que puede viajar, 
    private double cantidadcombustible; // que se gasta por kilometro (en litros)
    private double tanquedereserva; // (en litros).

    public Naves() {
    }

    public Naves(String Nombre, String identificador, int cantidadmaximapersonas, 
            int tiempo, int astronautas, int tiempodeaterrizaje, double velocidad, 
            double distanciamaxima, double cantidadcombustible, double tanquedereserva) {
        this.Nombre = Nombre;
        this.identificador = identificador;
        this.cantidadmaximapersonas = cantidadmaximapersonas;
        this.tiempo = tiempo;
        this.astronautas = astronautas;
        this.tiempodeaterrizaje = tiempodeaterrizaje;
        this.velocidad = velocidad;
        this.distanciamaxima = distanciamaxima;
        this.cantidadcombustible = cantidadcombustible;
        this.tanquedereserva = tanquedereserva;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getCantidadmaximapersonas() {
        return cantidadmaximapersonas;
    }

    public void setCantidadmaximapersonas(int cantidadmaximapersonas) {
        this.cantidadmaximapersonas = cantidadmaximapersonas;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getAstronautas() {
        return astronautas;
    }

    public void setAstronautas(int astronautas) {
        this.astronautas = astronautas;
    }

    public int getTiempodeaterrizaje() {
        return tiempodeaterrizaje;
    }

    public void setTiempodeaterrizaje(int tiempodeaterrizaje) {
        this.tiempodeaterrizaje = tiempodeaterrizaje;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getDistanciamaxima() {
        return distanciamaxima;
    }

    public void setDistanciamaxima(double distanciamaxima) {
        this.distanciamaxima = distanciamaxima;
    }

    public double getCantidadcombustible() {
        return cantidadcombustible;
    }

    public void setCantidadcombustible(double cantidadcombustible) {
        this.cantidadcombustible = cantidadcombustible;
    }

    public double getTanquedereserva() {
        return tanquedereserva;
    }

    public void setTanquedereserva(double tanquedereserva) {
        this.tanquedereserva = tanquedereserva;
    }

    @Override
    public String toString() {
        return Nombre 
                + ", cantidad maxima personas=" + cantidadmaximapersonas 
                + ", velocidad=" + velocidad + ", distancia maxima=" + distanciamaxima 
                + ", Combustible=" + cantidadcombustible 
                + ", tanque de reserva=" + tanquedereserva;
    }
     
    
    
    
}
