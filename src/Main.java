import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        var scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome :  ");
        var nome = scanner.nextLine();
        System.out.println("Digite a sua idade ");
        var age = scanner.nextInt();

        System.out.println("Digite (s/n) se você é emancipado: ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        
        var canDrive = (age >= 18 || (age >=16 && isEmancipated));
        if (canDrive) {
           
            System.out.printf("Olá %s, vc tem %s anos e você pode dirigir \n", nome, age);
        
    
        } else {
             System.out.printf("Olá %s, vc tem %s anos e você NÃO pode dirigir \n", nome, age);

              System.out.printf("FIM DE EXECUÇÃO\n");
        }

    }
}
   