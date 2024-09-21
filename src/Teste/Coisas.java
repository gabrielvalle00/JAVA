package Teste;

import java.util.*;
import java.lang.Math;

public class Coisas {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double km, viagemP, viagemL;

        System.out.println("Quantos Km você pretente percorre?");
        km = input.nextDouble();
        if (km == 200) {
            viagemP = km * 0.5;
            System.out.println("O valor da sua viagem é de R$" + viagemP);
        } else {
            viagemL = km * 0.45;
            System.out.println("O valor da sua viagem é de R$" + viagemL);
        }
    }
}
