package exercicios.lista_02;

import java.util.Scanner;

public class At08_classificarTerreno {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite a largura do terreno em metros: ");
        double largura = input.nextDouble();

        System.out.print("Digite o comprimento do terreno em metros: ");
        double comprimento = input.nextDouble();

        // Cálculo da área do terreno
        double area = largura * comprimento;

        // Exibe a área do terreno
        System.out.printf("A área do terreno é: %.2f m²%n", area);

        // Classificação do terreno com base na área
        if (area < 100) {
            System.out.println("Classificação: TERRENO POPULAR");
        } else if (area <= 500) {
            System.out.println("Classificação: TERRENO MASTER");
        } else {
            System.out.println("Classificação: TERRENO VIP");
        }
        input.close();
    }
}
