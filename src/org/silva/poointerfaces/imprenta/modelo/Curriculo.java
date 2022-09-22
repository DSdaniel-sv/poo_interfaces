package org.silva.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja{

    private String persona;
    private String carrera_profesional;
    private List<String> experiencia;

    public Curriculo(String persona, String carrera_profesional, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera_profesional = carrera_profesional;
        this.experiencia = new ArrayList<>();
    }
    public Curriculo addExperiencia(String exp){
        this.experiencia.add(exp);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n")
                .append("Profesion: ").append(this.carrera_profesional)
                .append("\n").append("Experiencias: \n");
        for (String exp: this.experiencia){
           sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}
