package banco;

public class ContaPoupanca extends Conta {
    
    // Método Construtor da classe ContaPoupanca que chama o construtor da superclasse Conta
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    
    // Método para imprimir o extrato da conta poupança
    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Poupança ***");
        super.imprimirInfosComum();
    }
}
