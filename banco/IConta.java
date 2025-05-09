package banco;

// Interface que define os métodos que devem ser implementados pelas classes que representam contas bancárias
public interface IConta {
    void depositar(double valor);
    
    void sacar(double valor);
    
    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

    void imprimirInfosComum();
}
