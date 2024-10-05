package exercicios.lista_01;

import java.util.Scanner;

public class At02_operacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler dois números
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Ler a operação desejada
        System.out.print("Digite a operação desejada (+, -, *, /, %): ");
        char operacao = scanner.next().charAt(0);

        double resultado;

        // Realizar a operação
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            case '%':
                resultado = num1 % num2;
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Operação inválida!");
        }

        // Fechar o scanner
        scanner.close();
    }
}
