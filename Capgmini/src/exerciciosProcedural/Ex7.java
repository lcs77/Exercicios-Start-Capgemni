package exerciciosProcedural;

import java.util.Scanner;

public class Ex7 { 
    /*7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. Afórmula de
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura emCelsius */

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);


    System.out.print("digite a temperatura em Celsius: ");
    float celcius = scan.nextFloat();

    float f = (9* celcius+160)/5;

    System.out.println("A temperatura em Fahrenheit:" + f);
}
    
}
