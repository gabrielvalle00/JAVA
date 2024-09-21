package exercicios;

public class Ex02_CalculoMedia {
    public static void main(String[] args) {
        // Criar duas variáveis para receber as notas de um aluno,
        //calcular a média e exibir o resultado

        double nota1 = 5.6;
        double nota2 = 6.5;
        double nota3 = 7.0;

        double media = (nota1+nota2+nota3)/3;
        String resultado =  String.format("A média do Aluno é: %s", media);
        System.out.println(resultado);
    }
}
