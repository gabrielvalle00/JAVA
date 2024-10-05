package exercicios.lista_02;

import java.util.Scanner;

public class At09_calcularIMC {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Digite o peso em kg: ");
        double peso = input.nextDouble();

        System.out.print("Digite a altura em metros: ");
        double altura = input.nextDouble();


        double imc = peso / (altura * altura);

        // Exibe o valor do IMC
        System.out.printf("Seu IMC é: %.2f%n", imc);

        // Classificação do IMC
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Classificação: Peso ideal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 40) {
            System.out.println("Classificação: Obesidade");
        } else {
            System.out.println("Classificação: Obesidade mórbida");
        }

        input.close();
    }
}
