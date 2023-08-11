import java.util.Scanner;

public class Desafio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");

        int numero = scanner.nextInt();

        for (int i = 0; i <=1000; i++){
            System.out.println(numero + " x "+ i +" = "+ (numero*i) + "\n");

        }
        System.out.println("1 - LIMPAR TABUADA 2 - SALVAR TABUADA");
        int n = scanner.nextInt();
        switch (n){
            case 1:
                System.out.println("Tabuada limpa com sucesso !");
                break;
            case 2:
                System.out.println("Tabuada salva com sucesso!");
                break;
        }
        scanner.close();
    }
}
