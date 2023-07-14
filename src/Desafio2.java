/*
* PEDIR PARA O USUARIO DIGITAR UM NUMERO
* CONVERTER O NUMERO EM INTEIRO
* PEDIR PARA O USUARIO DIGITAR OUTRO NUMERO
* CONVERTER EM NUMERO INTEIRO
*
* MOSTRAR O SEGUINTE TEXTO " O RESTO DA DIVISÃO DE NUMERO 1 POR NUMERO 2 É : (RESULTADO) "
*
* MOSTRAR A BASE ELEVADA AO EXPOENTE É : (RESULTADO)"
*
* */


import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        double n1 = scanner.nextDouble();

        System.out.println("Digite outro numero");
        double n2 = scanner.nextDouble();

        double elevado = Math.pow(n1, n2);
        System.out.println(" O \"" + n1 + "\" elevado ao \"" + n2 + "\" é : " + elevado);

        double restDivisao = n1 % n2;
        System.out.println(" O resto da divisao de \"" + n1 + "\" por \"" + n2 + "\" é : " + restDivisao);

        scanner.close();
    }
}
