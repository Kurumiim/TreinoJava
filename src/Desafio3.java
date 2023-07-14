/*DESAFIO 3
FAZER O JOGADOR 1 DIGITAR UM NUMERO
FAZER O JOGADOR 2 DIGITAR OUTRO NUMERO

SE FOREM IGUAIS, MOSTRAR A MENSAGEM ' EMPATE '

SORTEAR UM NUMERO ENTRE 0 E 1;

SE O NUMERO SORTEADO FOR 0, GANHA QUEM ESCOLHER O NUMERO MENOR

SE O NUMERO SORTEADO FOR 1, GANHA QUEM ESCOLHER O NUMERO MAIOR
* */
import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero do jogador numero 1");
        int jogadorN1 = scanner.nextInt();
        System.out.println("Numero do jogador numero 2");
        int jogadorN2 = scanner.nextInt();

        double nSorteado = Math.random()*2;

        if (nSorteado < 0.9){
            if (jogadorN1 < jogadorN2){
                System.out.println("Jogador numero 1 ganhou !");
            } else if (jogadorN1>jogadorN2) {
                System.out.println("Jogador numero 2 ganhou !");
                
            }else{
                System.out.println("Empate !");
            }
        }else {
            if (jogadorN1 > jogadorN2){
                System.out.println("Jogador numero 1 ganhou !");
            }else if (jogadorN1 < jogadorN2){
                System.out.println("Jogador numero 2 ganhou");
            }else {
                System.out.println("Empate !");
            }

        }
        scanner.close();
    }
}
