package banco;

public class ContaCorrente extends Conta{
    
    // Método Construtor da classe ContaCorrente que chama o construtor da superclasse Conta
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    // Método para imprimir o extrato da conta corrente
    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato Conta Corrente ***");
        super.imprimirInfosComum();
    }
}
