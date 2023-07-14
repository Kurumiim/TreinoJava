/* FAÇA UMA ESTRUTURA DE REPETIÇÃO ONDE A PESSOA TENHA QUE ESCOLHER 3 OPÇOES*/

import java.util.Scanner;

public class Desafio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um numero de 1 a 3");
        System.out.println(" 1 - Boa escolha 2 - Legal 3 -  Caramba!");
        int n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("Boa escolha");
                break;
            case 2:
                System.out.println("Legal");
                break;
            case 3:
                System.out.println("Caramba !");
                break;
            default:
                System.out.println("Escolha de 1 a 3");
        }
        scanner.close();
    }
}
