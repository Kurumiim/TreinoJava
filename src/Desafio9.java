import java.util.Scanner;
<<<<<<< HEAD
=======
import java.text.DecimalFormat;
>>>>>>> 3a0f951925ec94d30d0401e921727dab8f7a2232

public class Desafio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

<<<<<<< HEAD
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
=======
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

>>>>>>> 3a0f951925ec94d30d0401e921727dab8f7a2232
}
