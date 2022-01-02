
package modelo;


public class pelicula {
    
    private String nombre;
    private String director;
    private int anio;
    private double duracion;
    private String clasificacion;

    public pelicula(String nombre, String director, int anio, double duracion, String clasificacion) {
        this.nombre = nombre;
        this.director = director;
        this.anio = anio;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return "pelicula =" + "nombre=" + nombre + ", director=" + director + ", anio=" + anio + ", duracion=" + duracion + ", clasificacion=" + clasificacion +'\n';
    }
    
    
    
}
