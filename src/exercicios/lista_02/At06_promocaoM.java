package exercicios.lista_02;

import java.util.Scanner;

public class At06_promocaoM {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Entrada de dados
        System.out.print("Digite o nome do cliente: ");
        String nome = input.nextLine();

        System.out.print("Digite o sexo do cliente (M para masculino, F para feminino): ");
        char sexo = input.next().charAt(0);

        System.out.print("Digite o valor total das compras: R$ ");
        double valorCompras = input.nextDouble();

        double desconto = 0.0;

        // Aplicação do desconto baseado no sexo
        if (sexo == 'M' || sexo == 'm') {
            desconto = 0.05; // 5% de desconto para homens
        } else if (sexo == 'F' || sexo == 'f') {
            desconto = 0.13; // 13% de desconto para mulheres
        } else {
            System.out.println("Sexo inválido. O desconto não será aplicado.");
            desconto = 0.0; // Sem desconto se o sexo for inválido
        }

        // Cálculo do preço final com desconto
        double valorComDesconto = valorCompras - (valorCompras * desconto);

        // Saída do resultado
        System.out.printf("O valor total com desconto para %s é: R$ %.2f%n", nome, valorComDesconto);

        input.close();
    }
}
