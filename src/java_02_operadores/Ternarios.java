package java_02_operadores;

public class Ternarios {
    public static void main(String[] args) {

        double media;
        media = 7;
        String resultadoMedia = media >= 7 ? "Aprovado!" : "Em recuperação";
        System.out.println(resultadoMedia);


        //Exemplo
        boolean bomComportamento = false;
        boolean aprovadoPorMedia = media >= 7;
        String resultado = bomComportamento && aprovadoPorMedia ? "aprovado":"reprovado";
        System.out.println("Aluno " + resultado);
    }
}
