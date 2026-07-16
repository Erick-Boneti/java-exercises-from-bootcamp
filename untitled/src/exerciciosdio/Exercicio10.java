package exerciciosdio;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double media;

        Scanner sc = new Scanner(System.in);
        System.out.println("entre com a nota 1: ");
        double notaUm = sc.nextDouble();
        System.out.println("entre com a nota 2: ");
        double notaDois = sc.nextDouble();
        System.out.println("entre com a nota 3: ");
        double notaTres = sc.nextDouble();

        media = (notaDois + notaTres + notaUm) / 3;
        System.out.println("Media: " + media);

    }
}
