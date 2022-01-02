package peliculas;

import controladores.edicion;
import java.util.Scanner;

public class Peliculas {

    public static void main(String[] args) {

        String nombre;
        String director;
        int anio;
        double duracion;
        String clasificacion;
        edicion m = new edicion();

        do {
            System.out.println("Ingresa una opcion");
            System.out.println("1 - Ingresar Pelicula");
            System.out.println("2 - Eliminar Pelicula");
            System.out.println("3 - Mostrar Peliculas");
            System.out.println("4 - Salir");
            Scanner opc = new Scanner(System.in);
            int r = opc.nextInt();

            switch (r) {
                case 1:
                    System.out.println("Ingresar Pelicula");
                    Scanner dat = new Scanner(System.in);
                    System.out.println("Nombre");
                    nombre = dat.nextLine();
                    System.out.println("Director");
                    director = dat.nextLine();
                    
                    System.out.println("Anio");
                    anio = dat.nextInt();
                    System.out.println("Duracion");
                    duracion = dat.nextDouble();
                    dat.nextLine();
                    System.out.println("Clasificacion");
                    clasificacion = dat.nextLine();
                    m.insertar(nombre, director, anio, duracion, clasificacion);
                    break;
                case 2:
                    System.out.println("Eliminar Pelicula");
                    Scanner del = new Scanner(System.in);
                    System.out.println("Nombre");
                    nombre = del.nextLine();
                    m.eliminar(nombre);
                    System.out.println("Pelicula eliminada");
                    break;
                case 3:
                    System.out.println("Mostrar Peliculas");
                    m.mostrar();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vuelve a intentarlo");
                    break;
            }

        } while (true);

    }

}
