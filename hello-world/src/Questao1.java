import java.util.Scanner;

public class Questao1 {
    /*  Escreva um programa que informa a tabuada de multiplicação de um número informado pelo
        usuário (entre 1-10). Exemplo:
        Entre com um número de 1 a 10:
        1
        A tabuada de 1 é:
        1 x 1 = 1
        1 x 2 = 2
        1 x 3 = 3
        … */

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 10: ");
        int numero = input.nextInt();
        int i;

        if (numero > 0 && numero <= 10){
            System.out.println("A tabuada de " + numero + " eh: ");
            for (i = 1; i <= 10; i++){
                System.out.println(numero + "x" + i + "=" + numero * i);
            }
        } else{
            System.out.println("Numero digitado esta fora do intervalo entre 1 e 10.");
        }
    }
}
