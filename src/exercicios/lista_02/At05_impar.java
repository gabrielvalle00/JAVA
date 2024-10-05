package exercicios.lista_02;

import java.util.Scanner;

public class At05_impar {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();

        // Verifica se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        input.close();
    }
}
