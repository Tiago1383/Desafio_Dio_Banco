public class Main {
    public static void main(String[] args) {
        Cliente tiago = new Cliente();
        tiago.setNome("Tiago Melo");

        Conta corrente = new ContaCorrente(tiago);
        corrente.depositar(100);

        Conta poupanca = new ContaPoupanca(tiago);
        corrente.transferir(50, poupanca);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}

