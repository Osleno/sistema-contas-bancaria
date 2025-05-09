package banco;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Classe que representa um cliente bancário com atributos
public class Cliente {
    protected String nome;
    private String cpf;
    private String profissao;
    private String endereco;
    private String telefone;    
    private LocalDate dataNascimento;

    // Construtor vazio (útil para instanciar e setar depois)
    public Cliente() {
    }

    // Construtor completo, recebe a data como String e converte para LocalDate
    public Cliente(String nome, String cpf, String profissao, String endereco, String telefone, String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    // Métodos getters e setters para acessar/modificar os atributos privados
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    // Define a data de nascimento a partir de uma String formatada
    public void setDataNascimento(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dataNascimento = LocalDate.parse(dataNascimento, formatter);
    }   
}
