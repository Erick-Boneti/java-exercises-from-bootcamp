package exerciciosdio;
/*
* Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e

 se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7.*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        double media;

        Scanner sc = new Scanner(System.in);
        System.out.println("entre com seu nome: ");
        String nome = sc.next();
        System.out.println("entre com a nota 1: ");
        double notaUm = sc.nextDouble();
        System.out.println("entre com a nota 2: ");
        double notaDois = sc.nextDouble();
        System.out.println("entre com a nota 3: ");
        double notaTres = sc.nextDouble();
        System.out.println("entre com a nota 4: ");
        double notaQuatro = sc.nextDouble();

        media = (notaDois + notaTres + notaUm + notaQuatro) / 4;
        System.out.println(nome + " media: " + media + (media >= 7 ? " APROVADO" : " REPROVADO"));
    }
}
