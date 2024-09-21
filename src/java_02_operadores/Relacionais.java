package java_02_operadores;

public class Relacionais {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Verificar se os valores são iguais
        System.out.println(a == b);

        // Verificar se o primeiro valor é maior que o segundo
        System.out.println(a > b);

        // Verificar se o primeiro valor é maior ou igual que o segundo
        System.out.println(a >= b);

        // Verificar se o primeiro valor é menor que o segundo
        System.out.println(a < b);

        // Verificar se o primeiro valor é menor ou igual ao segundo
        System.out.println(a <= b);

        // Verificar se o primeiro valor é diferente do segundo
        System.out.println(a != b);

        double media;
        media = 7;
        boolean bomComportamento = true;
        boolean aprovadoPorMedia = media >= 7;
        boolean resultado = bomComportamento && aprovadoPorMedia;

        System.out.println("Aluno aprovado? " + resultado);
    }
}
