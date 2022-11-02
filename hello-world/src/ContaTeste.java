public class ContaTeste {
    public static void main(String[] args){
        Conta conta = new Conta();
        conta.cliente = "Ranulf";
        conta.saldo = 20000.00;
        //conta.exibesaldo();

        //conta.saque(10_000.00);
        //conta.exibesaldo();

        //conta.deposita(4000.00);
        //conta.exibesaldo();

        Conta destino = new Conta();
        destino.cliente = "Volke";
        destino.saldo = 5_000.00;
        destino.exibesaldo();
    }
}
