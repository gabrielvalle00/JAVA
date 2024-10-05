package exercicios.lista_02;

import java.util.Scanner;

public class At03_locadora {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite a quantidade de Km percorridos: ");
        double kmPercorridos = input.nextDouble();

        System.out.print("Digite a quantidade de dias alugados: ");
        int diasAlugados = input.nextInt();

        double precoPorDia = 90.00;
        double precoPorKm = 0.20;
        double total = (diasAlugados * precoPorDia) + (kmPercorridos * precoPorKm);

        System.out.printf("O preço total a pagar é: R$" + total);

        input.close();
    }
}
