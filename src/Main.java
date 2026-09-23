import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Informe um numero de 1 a 7 : ");
        var option = scanner.nextInt();

        switch (option) {

            case 1:
            case 7:
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
                
            case 6:
                System.out.println("Sexta-feira");
                break;
    
                default:
                System.out.println("Opção inválida");
                
            
        }
    }
}




//*
//  case 1 -> System.out.println("Domingo");
//  case 2 -> System.out.println("Segunda-feira");
//  case 3 -> System.out.println("Terça-feira");
//  case 4 -> System.out.println("Quarta-feira");
//  case 5 -> System.out.println("Quinta-feira");
//  case 6 -> System.out.println("Sexta-feira");
//  case 7 -> System.out.println("Sábado");
// default -> System.out.println("Opção inválida");
//   outra forma de fazer o switch case (n ultiliza o break), funciona em alguns java só 
// */




   