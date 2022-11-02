public class TesteMesa {

    public static void main (String[] args){
        double a = 8.75;
        double b = 5;
        double c = 5;
        double media = (a+b+c)/3;

        if (media >= 7){
            System.out.println("Aprovado");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperacao");
        } else if (media >= 0 && media < 5) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Media invalida");
    }

    }

}
