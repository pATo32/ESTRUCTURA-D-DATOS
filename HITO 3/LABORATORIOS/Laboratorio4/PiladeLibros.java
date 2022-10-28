package PiladeLibros;

import Hito3.PilaNumeros;

public class PiladeLibros {
    private int max;
    private int tope;
    private Libro[] libros;

    public PiladeLibros(int max){
        this.tope = 0;
        this.max = max;
        libros = new Libro[this.max + 1];
    }

    public boolean esVacio(){
        if (tope == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlenar(){
        if (tope == max){
            return true;
        } else {
            return false;
        }
    }

    public int nroElem(){
        return this.tope;
    }

    public void adicionar(Libro nuevoLibro){
        if (this.esLlenar() == false){
            this.tope = this.tope + 1;
            this.libros [this.tope] = nuevoLibro;
        } else {
            System.out.println("La Pila de Libros esta llena.");
        }
    }

    public Libro eliminar(){
        Libro elementoEliminado = null;

        if (this.esVacio() == false){
            elementoEliminado = this.libros[this.tope];
            this.tope = this.tope - 1;
        } else {
            System.out.println("La Pila de Libros esta vacia.");
        }
        return elementoEliminado;
    }

    public void llenar(){}

    public void mostrarPilaLibros(){
        Libro elem = null;
        if (esVacio()){
            System.out.println("Pila Vacia, no hay Item que mostrar");
        }
        else
        {
            System.out.println("\n Mostrando la Pila ");
            PiladeLibros aux = new PiladeLibros(this.max);
            while (!esVacio())
            {
                elem = this.eliminar();
                aux.adicionar(elem);
                elem.mostrarLibro();
            }
            vaciar(aux);
        }
    }

    public void vaciar(PiladeLibros aux){
        while (!aux.esVacio())
            adicionar(aux.eliminar());
    }
}