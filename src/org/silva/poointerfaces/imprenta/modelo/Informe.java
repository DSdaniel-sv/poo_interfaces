package org.silva.poointerfaces.imprenta.modelo;

public class Informe extends Hoja{

    private String autor;
    private String revisor;

    public Informe(String autor, String revisor, String contenido) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }
    @Override
    public String imprimir() {
        return "Realizado por: " + autor
                + "\nRevisado por: " + revisor
                + "\nContenido: " + this.contenido;
    }
}
