package java_01_introducao;

// Comentário de linha

/* Introdução do IntelliJ - 14/09
 * Inatrutor: Izaias
 * Introduação ao desenvolvimento em JAVA */

import java.util.Locale;

// Nome da Classe: 'Introducao', Tipo: 'public'
public class Introducao {

    /* Método principal
     *    Nome: main
     *    Tipo: public static void
     *         - public: método é acessivel a partir de outras classses
     *         - static: métodos da classe que não depedem de nenhuma vatiável de instância
     *         - void: indica que esse método não nenhum valor
     *     Parâmetro: String[] args
     *         - args: nome da variável
     *         - String[]: variável args que é do tipo Array
     * */
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        * Declaração de variáveis:
        * Para declarar uma variável, primeiro informamos o tipo e em seguida o
          nome dessa variável.
          Importante: lembre-se  que a liguagem JAVA diferencia letras minúsculas de maiúsculas
         */

        // Tipo STRING
        // Variável nome do tipo String, atribuindo o valor diretamente na declaração;
        String nome = "Valle";
        System.out.println(nome);

        // Variável Nome tipo String
        String Nome = "Gomes";
        System.out.println(Nome);


        // Data: 21/09/2024
        // Variável NOME tipo String
        String NOME = "Gabriel ";
        System.out.println(NOME + nome);

        // Tipos númericos
        // Variável 'idade' do tipo 'byte'
        byte idade;
        idade = 21;
        System.out.println(idade);

        // Variável 'int'
        int anosDeEmpresa;
        anosDeEmpresa = 5;
        System.out.println(anosDeEmpresa);

        // Variável do tipo 'long'
        long varLong;
        varLong = 109876543234L;
        System.out.println(varLong);

        // Variáveis númericas reias
        // Variável do tipo 'double'
        double pi = 3.14159;
        System.out.println(pi);

        // Variável do tipo 'Float'
        float valorFloat = 1_205_874.56F;
        System.out.println(valorFloat);

        // Tipo boolean
        // Utilizado para definir dados com valor verdadeiro ou fals0
        boolean eMairoDeIdade;
        eMairoDeIdade = false;
        System.out.println(eMairoDeIdade);

        // Tipo char (caractere)
        char sexo;
        sexo = 'M';
        System.out.println(sexo);

        // Classe String
        String texto;
        texto = "           Bom dia       ";
        System.out.println(texto + "!!!");
        // Variárel com espaço no início e final
        System.out.println(texto);
        // trim() retira os espaços iniciais e finais de uma String
        // Variável 'texto' após trim()
        System.out.println(texto.trim());


        String texto2 = "Boa tarde";
        System.out.println(texto2.concat("!!!"));

        String texto3 = texto2.concat("!!!");
        System.out.println(texto3.length());

        // Coloca todos os caracteres em letra maiúscula
        System.out.println(texto2.toUpperCase());

        // Coloca todos os caracteres em letra minúscula
        System.out.println(texto2.toLowerCase(Locale.ROOT));

        // "Boa tarde"
        System.out.println(texto2.equals("boa tarde"));


        String cidade;
        cidade = "Sumaré";
        byte dia;
        dia = 21;
        String mes;
        mes = "Setembro";
        short ano;
        ano = 2024;

        // Concatenar variáveis com sinais de '+'
        String localDate = cidade + ", " + dia + " de " + mes + " de " + ano;
        System.out.println(localDate);

        // Concatenar utilizando parâmentros
        System.out.printf("%s, %d de %s de %d", cidade, dia, mes, ano);
        System.out.println("\n");

        // Utilizando o 'String.format' para concatenar
        String aluno;
        aluno = "Valle";
        int idadeAluno;
        idadeAluno = 21;

        String infoAluno = String.format("Olá %s, Tudo bem? Sua idade é %d anos", aluno, idadeAluno);
        System.out.println(infoAluno);

        // Constantes
        final double VALOR_PI;
        VALOR_PI = 3.14159;
        System.out.println(VALOR_PI);
        // VALOR_PI = 3.5987; Erro, não é possivel alterar o valor de uma constante após a atribuição

        final int TESTE;
        TESTE = idade;
        System.out.println(TESTE);
    }
}
