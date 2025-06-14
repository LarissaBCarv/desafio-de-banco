public class Main {
    public static void main(String[] args) {

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(1000);
        cc.transferir(300, poupanca);

        Banco banco = new Banco();
        banco.setNome("Banco FURIA");
        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);

        banco.listarContas();
    }
}

