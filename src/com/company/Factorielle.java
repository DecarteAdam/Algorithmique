package com.company;

import java.util.Scanner;
public class Factorielle { // Le nom de la classe
    public static void main(String[] args) {// Paramètre de la méthode/fonction
        System.out.println("Entrez un nombre  :");// Afficher
        Scanner monEntier = new Scanner(System.in);//  Lire les entrées clavier
        int resultScan = monEntier.nextInt();// convertir en entier
        long total2 = fonctFact(resultScan);//resultat
        System.out.println("Le résultat est " + total2);// affichage
    }

        {
            long monTab[] = new long[10]; //monTab est un tableau  d'entiers de 10 indices

            for (int i = 0; i < monTab.length; i++) {
                monTab[i] = fonctFact(i);
                System.out.println(monTab[i]);
            }
        }


    public static long fonctFact(int monEntier2) {
        int total = 1;
        for (int i = 1; i <= monEntier2; i++) {
            total = total * i;
        }
        return total;
    }
}


    /*public boolean ajouterFactorielle(int Factorielle)
    {
        if(Factorielle >0)
        {
            if
        }

}
*/
