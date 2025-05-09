package banco;

public abstract class Conta implements IConta {
    
    // Atributos da classe Conta
    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    protected int agencia;
    protected int numeroConta;
    protected double saldo;
    protected Cliente cliente;

    // Método Construtor da classe Conta
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    // Método para depositar um valor na conta
    @Override
    public void depositar(double valor) {
        if (valor <= 5000 && valor > 0) { 
            saldo += valor;
            System.out.println(String.format("Valor de R$ %.2f depósitado com sucesso!",valor));
        } else if (valor > 5000) {
            System.out.println("Valor máximo de depósito é R$ 5000,00!");
        } else if (valor <= 0) {
            System.out.println("Valor inválido para depósito! Deposite um valor maior que R$ 0,00!");
        }
    }   

    // Método para sacar um valor da conta
    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo  && valor <= 5000) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else if (valor <= 0 || valor > this.saldo || valor > 5000) {
            System.out.println("Saque não realizado, valor inválido ou saldo insuficiente ou valor acima do permitido!");
        }
    }

    // Método para transferir o valor da conta para conta destino
    @Override
    public void transferir(double valor, Conta contaDestino) {
        
        if (valor > 0 && valor <= this.saldo && valor <= 5000) {
            System.out.println("Transferência realizada com sucesso!");
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else if (valor <= 0 || valor > this.saldo || valor > 5000) {
            System.out.println("Transferência não realizada, valor inválido ou saldo insuficiente ou valor acima do permitido!");
        }
    }

    // Método getters
    public int getAgencia() {
        return agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }

    // Método para imprimir o extrato da conta
    public void imprimirInfosComum() {
        System.out.println(String.format("Titular: %s",this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
