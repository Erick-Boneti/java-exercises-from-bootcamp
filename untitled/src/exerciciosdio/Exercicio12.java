package exerciciosdio;

import java.util.Scanner;

/*
*  Faça um algoritmo que leia o valor de um produto e determine o valor que deve ser pago, conforme a escolha da forma de pagamento
 pelo comprador e imprima na tela o valor final do produto a ser pago. Utilize os códigos da tabela de condições de pagamento para efetuar o cálculo adequado.

 Tabela de Código de Condições de Pagamento

 1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto
 2 - À Vista no cartão de crédito, recebe 10% de desconto
 3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros
 4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%*/

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor do produto: ");
        double valorProduto = sc.nextDouble();
        System.out.println("Entre com uma opção de pagamento:");
        System.out.println("1 = PIX | DINHEIRO; \n 2 = A VISTA CRED. \n 3 = 2x sem juros \n 4 = 3x ou + com juros ");
        int formaPag = sc.nextInt();
        double preco;
        switch (formaPag) {
            case 1:
                preco = valorProduto * 0.85;
                System.out.println(preco);
                break;
            case 2:
                preco = valorProduto * 0.90;
                System.out.println(preco);
                break;
            case 3:
                preco = valorProduto;
                System.out.println(preco);
                break;
            case 4:
                preco = valorProduto * 1.1;
                System.out.println(preco);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }

}
