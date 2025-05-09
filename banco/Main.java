package banco;

/**
 * Classe principal que contém o método main para executar o sistema bancário.
 * Aqui são criados clientes, contas (corrente e poupança), realizados depósitos,
 * transferências e impressões de extratos, além da listagem de contas do banco.
 */
public class Main {
    public static void main(String[] args) {
        Cliente Luiz = new Cliente("Luiz Fernando", "12345678900", "Engenheiro", "Rua A, 123", "123456789", "19/10/1990");
        Cliente Fernanda = new Cliente("Fernanda Almeida", "98765432100", "Médica", "Rua B, 456", "987654321", "02/02/1992");

        Conta cc = new ContaCorrente(Luiz);
        Conta cp = new ContaPoupanca(Fernanda);
        
        cp.depositar(5000);
        cp.transferir(100,cc);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        Banco banco = new Banco("Nubank");
        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.listarContas();
    }
}
