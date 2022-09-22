package org.silva.poointerfaces.imprenta;

import org.silva.poointerfaces.imprenta.modelo.Curriculo;
import org.silva.poointerfaces.imprenta.modelo.Hoja;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Daniel Silva Valencia",
                "Ingenieria de sistemas", "Resumen laboral ...");
        cv.addExperiencia("Java");
        cv.addExperiencia("Git");
        cv.addExperiencia("GitHub");
        cv.addExperiencia("Vcode");
        cv.addExperiencia("Html");
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
