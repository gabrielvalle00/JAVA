package exercicios.lista_02;

import java.util.*;
public class At01_antecessor {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, ant, sucess;

        System.out.println("Digite um número:");
        num1 = input.nextInt();
        ant = num1 - 1;
        sucess = num1 + 1;
        System.out.println("O antecessor de " + num1 + " é " + ant);
        System.out.println("O sucessor de " + num1 + " é " + sucess);

        input.close();
    }
}







