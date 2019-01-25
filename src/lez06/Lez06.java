/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lez06;

/**
 *
 * @author tss
 */
public class Lez06 {

    public static void main(String[] args) {
        int numeroVocali = contaVocali("akaknvnvgjko");
        System.out.println("Numero vocali ->" + numeroVocali);
        System.out.println(palindroma("otto"));
    }

    /**
     * torna il numero di vocali di una stringa param caratteri return
     *
     */

    //  * @param caratteri
    // * @return
    //  */
    // indicare quali sono le vocali
    public static int contaVocali(String caratteri) {

        String vocali = "aeiou";

        caratteri = caratteri.toLowerCase();

        int contaVocali = 0;

        for (int i = 0; i < caratteri.length(); i++) {
            char lettera = caratteri.charAt(i);
            if (vocali.indexOf(lettera) != -1) {
                contaVocali++;
            }
        }
        return contaVocali;
    }

    public static boolean palindroma(String caratteri) {

        // torna vero se la frase è palindroma. Es otto
        //start
        // caratteri <-parola da verificare
        //ribaltata <- caratteri invertiti al contrario -> rep
        // se caratteri = ribaltata allora restituisco vero altrimenti return false
        //end
        //param caratteri
        //return
        String ribaltata = inverti(caratteri);
        if (caratteri.equals(ribaltata)) {
            return true;
        } else {
            return false;
        }

    }

    private static String inverti(String caratteri) {
        StringBuilder sb = new StringBuilder();
        for (int i = caratteri.length() - 1; i > 0; i--) {
            sb.append(caratteri.charAt(i));
        }
        return sb.toString();
    }

    // caratteri = parola da verificare
//per ogni coppia di caratteri
//se coppia è diversa return non palindroma altrimenti 
//end
    public static boolean palindroma1(String caratteri) {
        for (int i = 0; i < caratteri.length() - 1; i++) {
            if (caratteri.charAt(i) == caratteri.charAt(caratteri.length() - (i + 1))) {
                return false;
            }
        }
        return true;
    }
}
