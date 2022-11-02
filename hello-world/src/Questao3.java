import java.util.Arrays;
import java.util.Scanner;

public class Questao3 {
    /*
    Escreva um programa que lê o nome de 5 frutas e armazena num carrinho de compras. Ao final
    da entrada dos 5 itens, exiba a lista completa. Exemplo:
    Insira a sua lista de compras:
    banana
    maçã
    abacaxi
    melão
    mamão
    As frutas no seu carrinho são:
    banana, maçã, abacaxi, melão, mamão
     */

    public static void main(String[] args){
        String[] frutas = new String[5];
        System.out.println("Insira a sua lista de compras:");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < frutas.length; i++){
            frutas[i] = input.next();
        }
        System.out.println("As frutas no seu carrinho sao: ");

        //  for (String fruta: frutas){
        //        System.out.println(fruta + ",");
        //  }

        System.out.println(Arrays.toString(frutas));
    }
}


