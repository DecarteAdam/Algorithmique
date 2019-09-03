package com.company;
import java.util.Scanner;
public class M_exercices {// Le nom de la class
    public static void main(String[] args) {// La fonction
        System.out.println("Tapez la valaur de n:");
        Scanner nombre=new Scanner(System.in);
        int n=nombre.nextInt();
        int j = 0;//variable
        for (int i = 1; i <= n; i++){// boucle for
            j = j + i;

        }
        System.out.println("La somme des" + n + "premiers nombres esr : " + j);


    }
}

