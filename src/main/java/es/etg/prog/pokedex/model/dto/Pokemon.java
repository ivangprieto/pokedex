package es.etg.prog.pokedex.model.dto;

public class Pokemon {
    private final int numeroRegistro;
    private String nombre;
    private String tipo;

    public Pokemon(int numeroRegistro, String nombre, String tipo) {
        this.numeroRegistro = numeroRegistro;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
