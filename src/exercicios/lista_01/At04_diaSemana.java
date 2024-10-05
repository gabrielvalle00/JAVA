package exercicios.lista_01;

import java.util.Scanner;

public class At04_diaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do dia da semana: ");
        String dia = scanner.nextLine().toLowerCase();

        int numeroDia;

        switch (dia) {
            case "domingo":
                numeroDia = 1;
                break;
            case "segunda":
                numeroDia = 2;
                break;
            case "terça":
                numeroDia = 3;
                break;
            case "quarta":
                numeroDia = 4;
                break;
            case "quinta":
                numeroDia = 5;
                break;
            case "sexta":
                numeroDia = 6;
                break;
            case "sábado":
                numeroDia = 7;
                break;
            default:
                numeroDia = -1; // Para dia inválido
        }

        if (numeroDia == -1) {
            System.out.println("Dia inválido.");
        } else {
            System.out.println("O número do dia da semana é: " + numeroDia);
        }

        scanner.close();
    }
}
