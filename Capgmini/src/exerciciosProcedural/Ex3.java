package exerciciosProcedural;

import java.util.Scanner;

public class Ex3 {
    /** 3. Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância
total percorrida pelo automóvel e o total de combustível gasto;**/ 

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a quantidade de km rodados: ");
    float km = scan.nextFloat();

    System.out.println("Digite a quantidade de combustivel gastos: ");
    float combustivel = scan.nextFloat();

    System.out.println("A média de consumo de seu automóvel é: " + (km/combustivel));

}
    
}
