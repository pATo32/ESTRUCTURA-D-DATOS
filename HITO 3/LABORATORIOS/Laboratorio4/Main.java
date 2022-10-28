package PiladeLibros;

import Hito3.PilaNumeros;

public class Main {
    public static void main(String[] args) {
        Libro lib1 = new Libro("La odisea", "Homero", 48, 20.50, "Novela");
        Libro lib2 = new Libro("DBA I", "Saul", 50, 30.50, "Base de Datos");
        Libro lib3 = new Libro("DBA II", "Ana", 60, 40.50, "Base de Datos");
        Libro lib4 = new Libro("Programa Intro", "Micaela", 70, 50.50, "Logica");
        Libro lib5 = new Libro("Analisi y Disenho", "Juan", 80, 60.50, "Analisis");


        PiladeLibros pilaLibros = new PiladeLibros(10);
        pilaLibros.adicionar(lib1);
        pilaLibros.adicionar(lib2);
        pilaLibros.adicionar(lib3);
        pilaLibros.adicionar(lib4);
        pilaLibros.adicionar(lib5);

//        pilaLibros.mostrarPilaLibros();

//        LibrosPaginasMayora50(pilaLibros, 50);
        cambiaSentido(pilaLibros);
    }

    // Determinar cuantos libros tienen una cantidad de paginas mayor a 50

    public static void LibrosPaginasMayora50(PiladeLibros pila, int cantidad) {
        PiladeLibros aux = new PiladeLibros(10);
        Libro libroEliminado = null;
        int mayores = 0;

        while (!pila.esVacio()) {
            libroEliminado = pila.eliminar();

            if (libroEliminado.getNroPag() > cantidad) {
                mayores = mayores + 1;

                aux.adicionar(libroEliminado);
            }
        }
        pila.vaciar(aux);

        System.out.println("Cantidad Mayor a 50 es: " + mayores);
    }
    // cambiar el sentido de los items, el ultimo al primero y viceversa

    public static void cambiaSentido(PiladeLibros pila) {

        PiladeLibros aux = new PiladeLibros(10);
        Libro libroEliminado1 = pila.eliminar();
        Libro libroEliminado2 = null;
        Libro PrimerlibroEliminado = null;

            while (!pila.esVacio()) {
                libroEliminado2 = pila.eliminar();
                aux.adicionar(libroEliminado2);
            }
            PrimerlibroEliminado = aux.eliminar();
            aux.adicionar(libroEliminado1);
            pila.vaciar(aux);
            pila.adicionar(PrimerlibroEliminado);
            pila.mostrarPilaLibros();
        }
    }

