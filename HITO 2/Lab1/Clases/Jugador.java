package Campeonato.Clases;

public class Jugador {
    private String apellidos;
    private String ci;
    private int edad;
    private String nombreCompleto;


    public Jugador(String nombreCompleto , String apellidos , String ci , int edad){
        this.nombreCompleto = nombreCompleto;
        this.apellidos = apellidos;
        this.ci = ci;
        this.edad = edad;
    };

    public String getApellidos() {
        return apellidos;
    }

    public String getCi() {
        return ci;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }



    public void mostrarJugador(){
        System.out.println("Mostrando datos del Jugador");
        System.out.println("Nombre Jugador: " + this.getNombreCompleto());
        System.out.println("Apellido Jugador: " + this.getApellidos());
        System.out.println("Ci Jugador: " + this.getCi());
        System.out.println("Edad Jugador: " + this.getEdad());
    }
}
