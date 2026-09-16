import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        exercicio1_areaQuadrado();
        exercicio2_areaRetangulo();
        exercicio3_diferencaIdade();
    }

    public static void exercicio1_areaQuadrado() {
        var scanner = new Scanner(System.in);
        System.out.println("Insira o lado do quadrado: ");
        var lado = scanner.nextInt();
        var area = lado * lado;
        System.out.printf("A área do quadrado é: %d%n", area);
    }

    public static void exercicio2_areaRetangulo() {
        var scanner = new Scanner(System.in);
        System.out.println("Insira a base do retângulo: ");
        var base = scanner.nextInt();
        System.out.println("Insira a altura do retângulo: ");
        var altura = scanner.nextInt();
        var area = base * altura;
        System.out.printf("A área do retângulo é: %d%n", area);
    }

    public static void exercicio3_diferencaIdade() {
        var scanner = new Scanner(System.in);
        System.out.println("Insira o nome da primeira pessoa: ");
        var name = scanner.nextLine();
        System.out.println("Insira a idade da primeira pessoa: ");
        var age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira o nome da segunda pessoa: ");
        var secondName = scanner.nextLine();
        System.out.println("Insira a idade da segunda pessoa: ");
        var age2 = scanner.nextInt();
        var diferenca = Math.abs(age - age2);
        System.out.printf("Olá %s e %s, a diferença de idade entre vocês é de %d anos%n", name, secondName, diferenca);
    }
}