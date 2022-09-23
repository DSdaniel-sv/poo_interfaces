package org.silva.poointerfaces.imprenta;

import org.silva.poointerfaces.imprenta.modelo.Curriculo;
import org.silva.poointerfaces.imprenta.modelo.Hoja;
import org.silva.poointerfaces.imprenta.modelo.Informe;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo("Daniel Silva Valencia",
                "Ingenieria de sistemas", "Resumen laboral ...");
        cv.addExperiencia("Java");
        cv.addExperiencia("Git");
        cv.addExperiencia("GitHub");
        cv.addExperiencia("Vcode");
        cv.addExperiencia("Html");

        Informe inf = new Informe("Niels Baltodano V."
                ,"Santiago Baltodano P."
                ,"Estudio de microservicios");

        System.out.println();
        imprimir(cv);
        imprimir(inf);
    }

    public static void imprimir(Hoja imprimible){
        System.out.println(imprimible.imprimir());
    }
}
