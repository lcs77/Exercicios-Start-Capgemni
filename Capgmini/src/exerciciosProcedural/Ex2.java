package exerciciosProcedural;

import java.util.Scanner;

/**2. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão
dos dois números lidos;**/


public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        float n1 = scan.nextInt();

        System.out.println("Digite outro número inteiro: ");
        float n2 = scan.nextInt();

        System.out.println("A soma dos dois números informados é: "+ (n1+n2));
        System.out.println("A subtração dos dois números informados é: "+ (n1-n2));
        System.out.println("A divisão dos dois números informados é: "+ (n1/n2));
        System.out.println("A multiplicação dos dois números informados é: "+ (n1*n2));
    }
}
