package exerciciosProcedural;

import java.util.Scanner;

public class Ex4 {
    /*4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas
efetuadas, informar o seu nome, o salário fixo e salário no final do mês;
 */

 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o nome do vendedor: ");
    String vendedor = scan.nextLine();

    System.out.println("Digite o salario do vendedor: ");
    float salarioFixo = scan.nextFloat();

    System.out.println("Digite o total de vendas do vendedor em R$: ");
    float totalVendas = scan.nextFloat();
    System.out.println();

    System.out.println("Nome: " + vendedor);
    System.out.println("Salario fixo: " + salarioFixo);
    System.out.println("Salario final: " +((totalVendas * 0.15)+salarioFixo));
    


 }
    
}
