import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor");
        double valor = scanner.nextDouble();
        System.out.println("R$"+valor);

        final int dobra = 2;
        DecimalFormat df = new DecimalFormat("0.00");

        for (int i = 1; i <=31; i++){
            valor*=dobra;
            System.out.println("Dia " + i + " R$"+ df.format(valor));
        }
        scanner.close();
    }

}
