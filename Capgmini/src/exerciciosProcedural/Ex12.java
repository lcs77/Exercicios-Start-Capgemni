package exerciciosProcedural;

import java.util.Scanner;

public class Ex12 {
    /*12. O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos
45%, escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do
mesmo; */

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);  

    System.out.println("Digite o custo de fábrica do veículo");
    float carro = scan.nextFloat();

    float imposto = carro * 0.45f;
    float distribuidor = (carro + imposto) * 0.28f; 
    float carroFinal = carro + distribuidor + imposto;
    System.out.println("valor final do carro é de: " + carroFinal);
}
}
