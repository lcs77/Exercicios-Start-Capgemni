package exerciciosProcedural;

import java.util.Scanner;

public class Ex5 {
    /*5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
No finalinformar o nome do aluno e a sua média (aritmética); */

public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("digite o nome do aluno: ");
    String nomeAluno = scan.nextLine();
    System.out.print("digite a nota 1: ");
    float n1 = scan.nextFloat();
    System.out.print("digite a nota 2: ");
    float n2 = scan.nextFloat();
    System.out.print("digite a nota 3: ");
    float n3 = scan.nextFloat();
    

    System.out.println("Aluno:" + nomeAluno + "nota média do aluno: " + ((n1+n2+n3)/3));
}
    
}
