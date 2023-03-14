package exerciciosProcedural;

import java.util.Scanner;

public class Ex9 {
    /*9. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um
mês.Considere fixo o juro da poupança em 0,07% a. m; */

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite o valor que será investido: ");
    float valor = scan.nextFloat();

    System.out.println("resultado do seu investimento no mês: " + (valor + (valor*0.07)));

}
}
