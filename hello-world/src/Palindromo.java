import java.util.Scanner;

public class Palindromo {
    /*
    Criar um programa que leia uma palavra e mostre se tal palavra é um palíndromo ou não, exemplo:
    Digite uma palavra:
    Roma
    Resultado: Roma não é palíndromo Digite uma palavra:
    Reger
    Resultado: Reger é palíndromo
    */

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = input.next();
        String palavraInvertida = "";
        int tamanho = palavra.length();

        for (int i = tamanho-1; i >= 0; i--){
            palavraInvertida += palavra.charAt(i);
        }

        if (palavra.equalsIgnoreCase(palavraInvertida)){
            System.out.println(palavra + " Essa palavra eh um palindromo");
        } else {
            System.out.println(palavra + " Essa palavra nao eh palindromo");
        }
    }

}
