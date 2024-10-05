package exercicios.lista_02;

import java.util.Scanner;

public class At10_reajusteSalario {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salarioAtual = input.nextDouble();

        System.out.print("Digite o gênero do funcionário (M para masculino, F para feminino): ");
        char genero = input.next().charAt(0);

        System.out.print("Digite o número de anos que o funcionário trabalha na empresa: ");
        int anosDeEmpresa = input.nextInt();

        double novoSalario = salarioAtual;

        if (genero == 'F' || genero == 'f') {
            if (anosDeEmpresa < 15) {
                novoSalario += salarioAtual * 0.06;
            } else if (anosDeEmpresa <= 20) {
                novoSalario += salarioAtual * 0.14;
            } else {
                novoSalario += salarioAtual * 0.25;
            }
        } else if (genero == 'M' || genero == 'm') {
            if (anosDeEmpresa < 20) {
                novoSalario += salarioAtual * 0.04;
            } else if (anosDeEmpresa <= 30) {
                novoSalario += salarioAtual * 0.15;
            } else {
                novoSalario += salarioAtual * 0.27;
            }
        } else {
            System.out.println("Gênero inválido. Por favor, digite M ou F.");
            return;
        }

        System.out.printf("O novo salário do funcionário é: R$ %.2f%n", novoSalario);

        input.close();
    }
}
