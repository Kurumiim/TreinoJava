/*
* Problema
* - Pedir para o usuário digitar um número e mostrar a tabuada desse numero de 1 a 1000.*/

import java.util.Scanner;

public class Desafio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um numero");

        int numero = scanner.nextInt();

        int i = 1;

        while (i <= 1000) {
            System.out.println(numero + " x " + i + " = \n" + (numero * i));
            i = i+1;
        }
        System.out.println("Saiu do loop !");

        scanner.close();
    }
}
