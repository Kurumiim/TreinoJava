/*FAÇA UM BOLETIM ESCOLAR CONTENDO 4 NOTAS E SE O ALUNO ESTIVER COM A NOTA 5 OU INFERIOR FOI REPROVADO
* SE FOR ENTRE 6 E 7 ELE ESTA DE RECUPERAÇÃO E SE FOR MAIOR QUE 7 ELE ESTA APROVADO !*/

import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota : ");
        double n1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota : ");
        double n2 = scanner.nextDouble();

        System.out.println("Digite a terceira nota : ");
        double n3 = scanner.nextDouble();

        System.out.println("Digite a quarta nota : ");
        double n4 = scanner.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        if (media > 0 && media <=5){
            System.out.println("Sua media é = "+media+" Voce esta reprovado !");
        } else if (media > 5 && media <=6.9) {
            System.out.println("Sua media é = "+media+" Voce esta de recuperação !");
        } else{
            System.out.println("Sua media é = "+media+" Voce esta aprovado, parabens !");
        }
        scanner.close();
    }

}
