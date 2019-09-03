package com.company;

import java.util.Scanner;// package scanner pour lire les entrées clavier

public class Main {

    public static void main(String[] args) {
        System.out.println("Tapez la valaur de n:");// Affichage de message
        Scanner nombre=new Scanner(System.in);//recuperaton de n
        int n=nombre.nextInt();// definition de variable
        int j = 0;//variable
        for (int i = 1; i <= n; i++){// boucle for
            j = j + i;

        }
        System.out.println("La somme des" + n + "premiers nombres esr : " + j);
    }
}
