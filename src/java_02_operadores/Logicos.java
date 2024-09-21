package java_02_operadores;

public class Logicos {
    public static void main(String[] args) {

        boolean dinehiro = true;
        boolean sol = false;

        System.out.println(dinehiro && sol);
        System.out.println(dinehiro || sol);
        System.out.println(!dinehiro);
        System.out.println(!sol);

        System.out.println("================= Tabela verdade E - AND (&&) =================");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        System.out.println("================= Tabela verdade OU - OR (||) =================");
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        System.out.println("================= NOT negação - (!) =================");
        System.out.println(!false); // true
        System.out.println(!true); // false
    }
}
