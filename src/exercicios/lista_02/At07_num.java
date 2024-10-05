package exercicios.lista_02;

import java.util.Scanner;

public class At07_num {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Entrada de dados
        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = input.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = input.nextInt();

        // Comparação dos números e exibição da mensagem correspondente
        if (numero1 > numero2) {
            System.out.println("O primeiro valor é o maior.");
        } else if (numero2 > numero1) {
            System.out.println("O segundo valor é o maior.");
        } else {
            System.out.println("Não existe valor maior, os dois são iguais.");
        }

        input.close();
    }
}
