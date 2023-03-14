package exerciciosProcedural;

import java.util.Scanner;

public class Ex6 {

    /* 6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variávelApasse a
possuir ovalor da variável B e a variável B passe a possuir o valor da variável A.Apresentar osvalores
trocados;  */

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o numero 1: ");
    int a = scan.nextInt();
    System.out.println("Digite o numero 2: ");
    int b = scan.nextInt();

    int c = b;
    b = a;
    a = c;
    System.out.println(a);
    System.out.println(b);
}
    
}
