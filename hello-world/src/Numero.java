import java.util.Scanner;

public class Numero {
    /*
    Crie um programa que receba um número. Se o número for par apresente o quadrado,
    se for ímpar apresente o cubo.
     */
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        double num = input.nextDouble();
        if (num % 2 == 0){
            System.out.println(Math.pow(num, 2));
        } else {
            System.out.println(Math.pow(num, 3));
        }
    }
}