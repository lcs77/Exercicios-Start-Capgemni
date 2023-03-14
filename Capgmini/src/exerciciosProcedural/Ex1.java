package exerciciosProcedural;

import java.util.Scanner;


//1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;


public class Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int n1 = scan.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int n2 = scan.nextInt();

        System.out.println("A soma dos dois números informados é: "+ (n1+n2));
       
    }
}
