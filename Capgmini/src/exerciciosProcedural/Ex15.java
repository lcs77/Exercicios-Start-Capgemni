package exerciciosProcedural;

import java.util.Scanner;

public class Ex15 {
    /*15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200; */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Digite um numero: ");
    int num = scan.nextInt();

    if(num >= 100 && num <= 200){
        System.out.println("Está no intervalo ente 100 e 200");
    }else{
        System.out.println("Não está no intervalo entre 100 e 200");
    }
}


}

