import java.util.Scanner;   

public class Main {

    
    public static void main(String[] args) {

        var value1 = 50;
        var value2 = 100;
        System.out.println(--value1);
        System.out.println(++value2);
        
        var value3 = 100;
        var value4 = 50;
        System.out.println(10 + value3--); // 10 + 100 = 110 dps 109
        System.out.println(10 + value4++); // 10 + 50 = 60 dps 61

        // + = Soma, pode usar em strings
        // - = Subtração
        // * = Multiplicação
        // / = Divisão
        // %% = Resto da divisão
        // math.pow() = Potência (math.pow(2, 3) = 2³ = 8) podemos alterar a base e o expoente
        // math.sqrt() = Raiz quadrada
        
    }

}
