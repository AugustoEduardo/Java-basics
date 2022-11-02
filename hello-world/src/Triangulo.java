public class Triangulo {

    public static void main (String[] args){
        int a = 4;
        int b = 5;
        int c = 6;

        if (a < b+c && b < a+c && c < a+b){
            if (a == b && b == c){
                System.out.println("Triangulo Equilatero");
            } else if (a==b || b==c || a==c) {
                System.out.println("Triangulo Isosceles");
            } else{
                System.out.println("Triangulo Escaleno");
            }
        } else {
            System.out.println("Nao foi possivel formar um triangulo");
        }
    }
}