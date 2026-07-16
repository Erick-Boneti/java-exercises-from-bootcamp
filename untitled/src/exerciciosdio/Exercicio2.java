package exerciciosdio;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um número: ");
        num = sc.nextInt();

        if ( num % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}
