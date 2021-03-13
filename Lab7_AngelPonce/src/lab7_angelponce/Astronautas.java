package lab7_angelponce;

public class Astronautas {
    private String ID, nombre, apellido, nacionalidad, titulouniversitario, contexturafisica;
    private double peso; //en kilogramos
    private int cantidadmisiones=0; // que ha tenido previamente (cero, de forma predeterminada). 

    public Astronautas() {
    }

    public Astronautas(String ID, String nombre, String apellido, String nacionalidad, String titulouniversitario, String contexturafisica, double peso) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.titulouniversitario = titulouniversitario;
        this.contexturafisica = contexturafisica;
        this.peso = peso;
    }
    
    

    public Astronautas(String ID, String nombre, String apellido, String nacionalidad, 
            String titulouniversitario, String contexturafisica, double peso, int cantidadmisiones) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.titulouniversitario = titulouniversitario;
        this.contexturafisica = contexturafisica;
        this.peso = peso;
        this.cantidadmisiones = cantidadmisiones;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTitulouniversitario() {
        return titulouniversitario;
    }

    public void setTitulouniversitario(String titulouniversitario) {
        this.titulouniversitario = titulouniversitario;
    }

    public String getContexturafisica() {
        return contexturafisica;
    }

    public void setContexturafisica(String contexturafisica) {
        this.contexturafisica = contexturafisica;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCantidadmisiones() {
        return cantidadmisiones;
    }

    public void setCantidadmisiones(int cantidadmisiones) {
        this.cantidadmisiones = cantidadmisiones;
    }

    @Override
    public String toString() {
        return nombre; 
                
    }
    
    
    
}
