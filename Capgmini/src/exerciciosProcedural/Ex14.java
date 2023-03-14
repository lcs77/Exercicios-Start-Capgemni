package exerciciosProcedural;

import java.util.Scanner;

public class Ex14 {
    /*14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite um numero: ");
        int num = scan.nextInt();
        System.out.println("Digite outro numero: ");
        int num2 = scan.nextInt();
    
        if(num>num2){
            System.out.println(num+">"+num2);
        }else if(num==num2){
            System.out.println(num+"=="+num2);
        }
        else{
            System.out.println(num2+">"+num);
     }
}
}
