package Campeonato_Unifranzitos;

import Campeonato.Clases.Equipo;

public class Campeonato {

    private String nombreCampeonato;
    private Equipo[] equipos;


    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public Campeonato(String nombreCampeonato, Equipo[] equipos) {
        this.nombreCampeonato = nombreCampeonato;
        this.equipos = equipos;

    }

    public void mostrarCampeonato() {
        System.out.println("Mostrando datos del Campeonato");
        System.out.println("Nombre Campeonato: " + this.getNombreCampeonato());

        for (int i = 0; i < this.getEquipos().length; i++) {
            this.getEquipos()[i].mostrarEquipo();
        }
    }
}

