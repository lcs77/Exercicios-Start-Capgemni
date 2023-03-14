package exerciciosProcedural;

import java.util.Scanner;

public class Ex13 {
    /*13. Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10;
 */

 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite um numero: ");
    int num = scan.nextInt();

    if(num>10){
        System.out.println("número maior que 10");
    }else{
        System.out.println("número menor que 10");
    }
 }
}
