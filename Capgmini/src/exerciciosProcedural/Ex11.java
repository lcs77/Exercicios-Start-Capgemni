package exerciciosProcedural;

import java.util.Scanner;

public class Ex11 {
    /*11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário; */

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o preço de custo do produto: ");
    float produto = scan.nextFloat();
    System.out.println("Digite a margem de lucro em % do produto: ");
    float margem = scan.nextFloat();

    System.out.println("O preço para venda do produto é de: " + (produto+((margem/100)*produto)));

}
}
