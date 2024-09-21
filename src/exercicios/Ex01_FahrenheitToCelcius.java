package exercicios;

public class Ex01_FahrenheitToCelcius {
    public static void main(String[] args) {
        // (F - 32) * 5/9 = Celcius

        double Fahrenheit = 104;
        final double AJUSTE = 32;
        double divisao = (double) 5/9;
        double celcius;

        celcius = (Fahrenheit - AJUSTE) * divisao;
        String resultado =  String.format("A conversão de %s Farenheit para graus Celcius é %s°", Fahrenheit, celcius);
        System.out.println(resultado);
    }
}
