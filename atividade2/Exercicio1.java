import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Operações");
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int escolha = scanner.nextInt();
        double resultado = 0;

        if (escolha == 1) {
            resultado = numero1 + numero2;
        } else if (escolha == 2) {
            resultado = numero1 - numero2;
        } else if (escolha == 3) {
            resultado = numero1 * numero2;
        } else if (escolha == 4) {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Erro! Divisão por zero.");
                System.exit(1);
            }
        } else {
            System.out.println("Opção inválida.");
            System.exit(1);
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}