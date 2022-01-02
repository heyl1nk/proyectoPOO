
package controladores;

import java.util.ArrayList;
import modelo.pelicula;


public class edicion {
    
    ArrayList<pelicula> p = new ArrayList();

    public edicion() {
        
    }
    
    public void insertar(String nombre,String director,int anio,double duracion,String clasificacion){
        pelicula pe = new pelicula(nombre,director,anio,duracion,clasificacion);
        p.add(pe);
    }
    
    public void mostrar(){
        System.out.println(p.toString());
        
        for(pelicula pe : p){
            System.out.println(pe.getDirector());
        }
    }
    
    public void eliminar(String nombre){
        int bandera = 0;
        for(int i = 0; i<p.size();i++){
            pelicula pe = p.get(i);
            if(pe.getNombre().equals(nombre)){
                bandera = i;
            }
            break;
        }
        p.remove(bandera);
    }
    
 
    
}


