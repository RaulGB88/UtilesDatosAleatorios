/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.lib;

//Importacin de la clase Random.
import java.util.Random;

/**
 *
 * @author - Raúl Granel Blasco - raul.granel@gmail.com
 */
public class ValoresAleatorios {

    //Instanciacin de la clase Random.
    public static final Random RND = new Random(System.currentTimeMillis());

    //Obtiene número ENTERO aleatorio.
    public static int enteroAleatorio(int min, int max) {

        int numeroAleatorio = RND.nextInt(max - min + 1) - min;

        //Devolver valor.
        return numeroAleatorio;
    }

    //Obtiene número REAL aleatorio.
    public static double realAleatorio(double min, double max) {

        double numeroAleatorio = RND.nextDouble() * (max - min) - min;

        //Devolver valor.
        return numeroAleatorio;
    }

    //Obtiene número REAL aleatorio entre 0 y 1.
    public static double realAleatorio01() {

        double numeroAleatorio = RND.nextDouble();

        //Devolver valor.
        return numeroAleatorio;
    }

    //Obtiene valor BOOLEANO aleatorio.
    public static boolean valorAleatorio() {

        boolean valorAleatorio = RND.nextBoolean();

        //Devolver valor.
        return valorAleatorio;
    }

    //Obtiene CARÁCTER aleatorio.
    public static char caracterAleatorio(char min, char max) {

        char caracterAleatorio = (char) (RND.nextInt(max - min + 1) - min);

        //Devolver valor.
        return caracterAleatorio;
    }
}
