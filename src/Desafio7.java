import java.util.Scanner;

/*
 * Problema
 * - Pedir para o usuário digitar um número e mostrar a tabuada desse numero de 1 a 1000. Porém com loop for*/
public class Desafio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = scanner.nextInt();

        for (int i=1; i <=1000; i++){
            System.out.println(numero + " x " + i + " = \n" + (numero * i));
            if (i % 10 == 0){
                System.out.println("\n");
            }
        }
        scanner.close();
    }
}