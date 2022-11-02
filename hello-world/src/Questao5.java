import java.util.Scanner;

public class Questao5 {
    /*
    Altere o programa anterior para, ao invés de receber apenas o nome de uma fruta para compra,
    receber uma lista de frutas. Compare a lista de compras com a lista da promoção e calcule o
    desconto cumulativo de 5% para cada fruta correspondente. Ao final, informe qual será o
    desconto total (por exemplo, 3 itens correspondentes, resulta num desconto de 15%). Exemplo:
    A lista de frutas em promoção é: [banana, maçã, abacaxi, melão, mamão].
    Qual a sua lista de compras para hoje?
    mamão
    uva
    abacate
    melancia
    Você tem direito a um desconto de 5%. O mamão está em promoção!
     */

    public static void main(String[] args){
        String[] promoFrutas = {"banana", "maca", "abacaxi", "melao", "mamao"};
        Scanner input = new Scanner(System.in);
        System.out.println("Qual fruta voce deseja comprar hoje?");
        String frutaCompra = input.nextLine();  // banana, uva, maçã

        String[] listaCompra = frutaCompra.split(",");
        int cont = 0;

        for (String fruta: listaCompra){
            for (String frutaPromocao: promoFrutas){
                if (frutaPromocao.equalsIgnoreCase(fruta)){
                    cont++;
                }
            }
        }
        System.out.println("Voce tem direito a um desconto de " + cont*5 + "%.");
    }
}
