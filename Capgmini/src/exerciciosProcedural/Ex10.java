package exerciciosProcedural;

import java.util.Scanner;

public class Ex10 {
    /*10. A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros. Faça um
algoritmo que receba um valor de uma compra e mostre o valor das prestações;
 */

 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe o valor da compra: ");
    float compra = scan.nextFloat();

    System.out.println("O valor dividido em 2x: " +(compra/2));
    
    System.out.println("O valor dividido em 3x: " +(compra/3));
    
    System.out.println("O valor dividido em 4x: " +(compra/4));
    
    System.out.println("O valor dividido em 5x: " +(compra/5));
    
 }
}
