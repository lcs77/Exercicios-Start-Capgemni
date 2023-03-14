package exerciciosProcedural;

import java.util.Scanner;

public class Ex8 {
    /*8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também aquantidade de dólares
disponíveis com o usuário; */

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    
    

    System.out.print("digite a quantidade de dolares que deseja comprar: ");
    float dolar = scan.nextFloat();
    System.out.print("digite a cotação do dolar atual: ");
    float cotaAtual = scan.nextFloat();
    System.out.print("digite a quantidade de dolar disponiveis: ");
    float quantidadeDolarAtual =scan.nextFloat();


    if(quantidadeDolarAtual>dolar){
        System.out.println("a quantidade que deseja compra de dolar em reais baseado na cotação atual: " + (dolar*cotaAtual));
    }else{
        System.out.println("Infelizmente não temos a quantidade de dolares que deseja");
    }


}



}
