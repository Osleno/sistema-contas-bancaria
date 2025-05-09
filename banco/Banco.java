package banco;

import java.util.ArrayList;
import java.util.List;

// Classe que representa um banco com atributos 
public class Banco {
    private String nome;
    private List<Conta> contas;
    
    // Construtor da classe Banco que inicializa a lista de contas
    public Banco (String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    //Método para adicionar conta 
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    //Método para remover conta
    public void removerConta(Conta conta) {
        this.contas.remove(conta);
    }

    //Método para listar contas
    public void listarContas() {
        for (Conta conta : contas) {
            System.out.println("Banco: " + this.getNome() + ", Conta: " + conta.getNumeroConta() + ", Cliente: " + conta.getCliente().getNome());
        }
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Conta> getContas() {
        return contas;
    }
    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}

