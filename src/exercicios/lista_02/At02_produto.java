package exercicios.lista_02;

import java.util.Scanner;

public class At02_produto {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double valor, desconto, promocao;

        System.out.println("Digite o valor do produto:");
        valor = input.nextInt();
        desconto = valor * 0.05;
        promocao = valor - desconto;

        System.out.println("Preço promocional: R$" + promocao);

        input.close();
    }
}
