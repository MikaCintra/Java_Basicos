import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar;
 
     do {
        System.out.print("Digite o primeiro número:");
        double X = scanner.nextDouble();

        System.out.print("Escolha a operação (1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão):");
        int operacao = scanner.nextInt();

        System.out.print("Digite o segundo número:");
        double Y = scanner.nextDouble();

        Double resultado = realizarCalculo(X, Y, operacao);
        System.out.println("Resultado: " + resultado);

        continuar = verificarNovoCalculo();
     } while (continuar);

    }

    public static boolean verificarNovoCalculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deseja realizar um novo cálculo? (s/n): ");
        String resposta = scanner.next();
        return resposta.equalsIgnoreCase("s");
        }

    public static Double realizarCalculo(double x, double y, int operacao) {

     double respostaCalculo = 0;

        switch (operacao) {
            case 1:
                respostaCalculo = x + y;
                break;
            case 2:
                respostaCalculo = x - y;
                break;
            case 3:
                respostaCalculo = x * y;
                break;
            case 4:
                respostaCalculo = x / y;
                break;
            default:
                System.out.println("Operação inválida");
        }

        return respostaCalculo;
    }

    
}
