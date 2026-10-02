import java.util.Scanner;

public class Imc {
    
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);


        System.out.println("Insira seu peso");
        var peso = scanner.nextDouble();

        System.out.println("Insira sua altura");
        var altura = scanner.nextDouble();



        while(peso <= 0){
            System.out.println("Peso deve ser maior que zero! ");
            System.out.println("Insira um novo peso : ");
            peso = scanner.nextDouble();

        }       
        
        scanner.nextLine();

        while (altura <= 0) {
    System.out.println("A altura deve ser maior que zero");
    System.out.println("Insira uma nova altura: ");
    altura = scanner.nextDouble();
        }

        var imc = peso/(altura * altura);

        System.out.printf("IMC: %.2f\n", imc);

        if (imc <=  18.5 ) {
            System.out.println("Abaixo do peso");

        } else if (imc < 25 ){
            System.out.println("Peso Ideal");
        } else if (imc < 30 ){
            System.out.println("Levemente acima do peso");
        }else if (imc < 35 ){
            System.out.println("Obesidade Grau I");
        }else if (imc < 40 ){
            System.out.println("Obesidade Grau II (Severa)");
        }else {
            System.out.println("Obesidade III (Mórbida)");
        }
    }

}

