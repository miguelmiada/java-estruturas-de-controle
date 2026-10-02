import java.util.Scanner;
public class ParesImpares {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        var number1 = scanner.nextInt();
        System.out.println("Insira o segundo número: ");
        var number2 = scanner.nextInt();
        while (number2 <= number1) {
            System.out.println("Você deve inserir um número maior que o primeiro");
            System.out.println("Insira o segundo número: \n");
            number2 = scanner.nextInt();
        }
        var escolha = 0;
        while (escolha != 1 && escolha != 2) {
            System.out.println("Escolha: 1 - Ímpar / 2 - Par\n");
            escolha = scanner.nextInt();
            System.out.println("=====================================");
        }
        for (int i = number2; i >= number1; i--) {
            if ((escolha == 2 && i % 2 == 0) || (escolha == 1 && i % 2 != 0)) {
                System.out.printf("O número %s\n", i);
            }
        }
    }
}