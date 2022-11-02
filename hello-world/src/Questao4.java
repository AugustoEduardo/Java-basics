import java.util.Scanner;

public class Questao4 {

        /*
        Um supermercado anuncia diariamente uma lista com 5 frutas em promoção. Escreva um
        programa que recebe o nome de uma fruta que você deseja comprar e informa se a fruta
        pertence à lista de promoções. Exemplo:
        A lista de frutas em promoção é: [banana, maçã, abacaxi, melão, mamão].
        Qual fruta você deseja comprar hoje?
        banana
        Ótima escolha! Essa fruta está em promoção hoje.
         */

    public static void main(String[] args) {
        String[] promoFrutas = {"banana", "maca", "abacaxi", "melao", "mamao"};
        Scanner input = new Scanner(System.in);
        System.out.println("Qual fruta voce deseja comprar hoje?");
        String frutaCompra = input.nextLine();
        boolean frutaEmPromocao = false;

        for (String frutaPromo : promoFrutas) {
            if (frutaPromo.equalsIgnoreCase(frutaCompra)) {
                frutaEmPromocao = true;
                break;
            }
        }
        if (frutaEmPromocao) {
            System.out.println("Otima escolha! Essa fruta esta em promocao hoje.");
        } else {
            System.out.println("Volte sempre.");
        }
    }
}