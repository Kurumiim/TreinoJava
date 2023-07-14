import java.util.Scanner;

public class Desafio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int ano = 1004; ano <= 2024; ano+=4){
            if (!(ano % 100 == 0) || (ano % 400 == 0)){
            System.out.println(ano + "\n");
            }else{
                System.out.println(ano + " Não é bissexto \n");
            }
        }
        scanner.close();
    }
}
