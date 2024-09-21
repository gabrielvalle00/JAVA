package java_02_operadores;

public class Aritmeticos {
    public static void main(String[] args) {

        System.out.println(3 + 2);

        // Operações realizadas com números  inteiros terão resultados inteiros
        int a = 25;
        int b = 12;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        System.out.println(a / (float) b);
        System.out.println(a / (double) b);

        System.out.println("================ Operadores aritméticos com decimais ==================");
        // Operações realizadas com números decimais
        double c = 4.65;
        double d = 2.71;
        System.out.println(c + d);
        System.out.println(c - d);
        System.out.println(c * d);
        System.out.println(c / d);

        System.out.println("================ Módulo - resto da divisão ==================");
        int x = 11;
        int y = 5;
        System.out.println(x % y);

        System.out.println(20 % 3);

        // Verificar se o número é par ou impar, se for 0 = par.
        System.out.println(20 % 2);
        System.out.println(x % 2);
        System.out.println(y % 2);


    }
}
