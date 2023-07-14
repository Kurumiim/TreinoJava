/*
* PEDIR PARA O USUARIO DIGITAR UM NUMERO
* CONVERTER O NUMERO EM INTEIRO
* PEDIR PARA O USUARIO DIGITAR OUTRO NUMERO
* CONVERTER EM NUMERO INTEIRO
* ------------------------------------------------------
* MOSTRAR A SOMA
* MOSTRAR A SUBTRAÇÃO
* MOSTRAR A MULTIPLICAÇÃO
* MOSTRAR A DIVISÃO
*
* */

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo numero");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;

        System.out.println("O resultado da soma do primeiro numero \""+ n1 + "\" com o segundo numero  \"" + n2 + "\" é : " + soma);

        int subtracao = n1 - n2;
        System.out.println("O resultado da subtração do primeiro numero \""+ n1 + "\" com o segundo numero  \"" + n2 + "\" é : " + subtracao);

        int multiplicacao = n1 * n2;

        System.out.println("O resultado da multiplicação do primeiro numero \""+ n1 + "\" com o segundo numero  \"" + n2 + "\" é : " + multiplicacao);

        int divide = n1 / n2;
        System.out.println("O resultado da divisão do primeiro numero \""+ n1 + "\" com o segundo numero  \"" + n2 + "\" é : " + divide);

        scanner.close();
    }
}
