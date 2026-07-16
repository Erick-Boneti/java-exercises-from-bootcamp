package exerciciosdio;

/*
* Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.*/

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int maior;
        int meio;
        int menor;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um valor: ");
        int a = sc.nextInt();

        System.out.println("Entre com um valor: ");
        int b = sc.nextInt();

        System.out.println("Entre com um valor: ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            maior = a;
            if (b >= c) {
               meio = b;
               menor = c;
            }else {
                meio = c;
                menor = b;
            }
        }else if (b > a && b > c) {
            maior = b;
            if (a >= c) {
                meio = a;
                menor = c;
            }else {
                meio = c;
                menor = a;
            }
        }else {
            maior = c;
            if (b >= a) {
                meio = b;
                menor = a;
            }else {
                meio = a;
                menor = b;
            }
        }

        System.out.println(maior + " " + meio + " " + menor);
    }
}
