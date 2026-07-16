package exerciciosdio;
/**
 * Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
 *
 * de acordo com a tabela abaixo:
 *
 * Fórmula do IMC = peso / (altura) ²
 *
 * Tabela Condições IMC
 *
 *
 *
 *  Abaixo de 18,5   | Abaixo do peso
 *
 *  Entre 18,6 e 24,9 | Peso ideal (parabéns)
 *
 *  Entre 25,0 e 29,9 | Levemente acima do peso
 *
 *  Entre 30,0 e 34,9 | Obesidade grau I
 *
 *  Entre 35,0 e 39,9 | Obesidade grau II (severa)
 *
 *  Maior ou igual a 40 | Obesidade grau III (mórbida)
 */

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        double imc;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com seu peso: ");
        double peso = sc.nextDouble();
        System.out.println("Entre com sua altura em metros: ");
        double alturaM = sc.nextDouble();

        imc = peso / (alturaM * alturaM);
        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau 2");
        } else {
            System.out.println("Obesidade mórbida");
        }

    }
}
