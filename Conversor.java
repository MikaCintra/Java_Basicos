import java.text.DecimalFormat;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        // variáveis 
        double c, f;
        // objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.0");
        // variável para controlar o loop
        int continuar = 1;

        // loop
        while (continuar == 1) {
            System.out.println("Conversor de temperatura");
            System.out.println("1 - Fahrenheit para Celsius");
            System.out.println("2 - Celsius para Fahrenheit");
            int escolha = teclado.nextInt();

            if (escolha == 1) {
                System.out.println("Digite a temperatura em Fahrenheit: ");
                f = teclado.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.println("A temperatura em Celsius é: " + formatador.format(c) + "°C");
                System.out.println("Deseja fazer outra conversão? (1 - Sim, 2 - Não)");
                continuar = teclado.nextInt();
            } else if (escolha == 2) {
                System.out.println("Digite a temperatura em Celsius: ");
                c = teclado.nextDouble();
                f = (c * 9 / 5) + 32;
                System.out.println("A temperatura em Fahrenheit é: " + formatador.format(f) + "°F");
                System.out.println("Deseja fazer outra conversão? (1 - Sim, 2 - Não)");
                continuar = teclado.nextInt();
            } else {
                System.out.println("Por favor, escolha 1 ou 2.");
            }
        }

        // Fechar o Scanner fora do loop
        teclado.close();
    }
}