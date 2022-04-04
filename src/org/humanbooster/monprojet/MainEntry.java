package org.humanbooster.monprojet;
import org.humanbooster.monprojet.model.animaux.Cheval;
import org.humanbooster.monprojet.model.animaux.Tigre;


public class MainEntry {

    public static void main(String[] args) {

        Tigre tigre = new Tigre();
        System.out.println(tigre.manger());
        Cheval cheval = new Cheval();
        System.out.println(cheval.manger());

    }

}