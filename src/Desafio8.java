import java.util.Scanner;

public class Desafio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int ano = 1004; ano <= 2017; ano+=4){
            System.out.println(ano + "\n");
        }
        scanner.close();
    }
}
