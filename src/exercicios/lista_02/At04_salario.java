package exercicios.lista_02;

import java.util.Scanner;

public class At04_salario {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o número de dias trabalhados no mês: ");
        int diasTrabalhados = input.nextInt();

        int horasPorDia = 8;
        double salarioPorHora = 25.00;

        double salario = diasTrabalhados * horasPorDia * salarioPorHora;

        System.out.printf("O salário do funcionário é: R$" + salario);

        input.close();
    }
}
