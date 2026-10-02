import java.util.Scanner;

public class DivisaoResto {
    
    public static void main(String[] args) {

        var scannner = new Scanner(System.in);

        System.out.println("Informe um número:");
        var number = scannner.nextInt();
        var keepVerify = true;

        while(keepVerify){

            System.out.println("Informe o número para verificação: ");
            var toVerify = scannner.nextInt();

            if(toVerify < number){
                System.out.printf("Informe um número maior que %s\n", number);
                continue;
            }

            var result = toVerify % number ;
            keepVerify = result == 0;
            System.out.printf("%s %% %s = %s\n", toVerify, number, result);
        }
        
        
    }
}