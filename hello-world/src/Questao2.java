import java.util.Scanner;

public class Questao2 {
    /*
    Escreva um programa que converte temperaturas de Celsius para Fahrenheit. Fórmula (0 °C × 9/5) + 32 = 32 °F.
    Exemplo:
    Entre com uma temperatura em Celsius para saber seu equivalente em Fahrenheit:
    22
    O equivalente a 22 C é 71,6 F.
     */

    public static void main(String[] args){
        System.out.println("Entre com uma temperatura em Celsius "
                + "para saber seu equivalente em Fahrenheit: ");

        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        double fahrenheit = num * 9.0/5.0 + 32;

        System.out.println("O equivalente a " + num + "C" + " eh " + fahrenheit + "F");
    }
}
