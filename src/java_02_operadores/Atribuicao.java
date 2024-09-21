package java_02_operadores;

public class Atribuicao {
    public static void main(String[] args) {

        // Atribuição de valores
        int a = 6;
        int b = 8;

        int c = a + b;
        int d = a;

        // Formas reduzidas para realizar atribuição
        int res = 50;

        res += b; //res = res + b;
        res -= b; //res = res - b;
        res *= b;//res = res * b;
        res /= b;//res = res / b;

        System.out.println(res);

        // c+=b; // c = c + b


    }
}
