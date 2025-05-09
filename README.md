# Sistema Bancário em Java

Este é um projeto simples de um sistema bancário desenvolvido em Java com foco em Programação Orientada a Objetos (POO). O sistema permite criar clientes, contas (corrente e poupança), realizar operações bancárias como depósitos, saques e transferências, além de exibir extratos e listar contas registradas em um banco.

---

## Estrutura do Projeto

- `Cliente.java` — Representa um cliente com dados pessoais.
- `Conta.java` — Classe abstrata base com operações comuns.
- `ContaCorrente.java` — Representa uma conta corrente.
- `ContaPoupanca.java` — Representa uma conta poupança.
- `IConta.java` — Interface que define as operações bancárias.
- `Banco.java` — Classe para gerenciar um banco e suas contas.
- `Main.java` — Classe principal com o método `main` para execução do sistema.

---

## Funcionalidades

- Criar contas correntes e poupança
- Realizar **depósitos** (máx. R$5000,00)
- Realizar **saques** (máx. R$5000,00)
- Fazer **transferências** entre contas
- Imprimir **extratos** individuais
- Listar todas as contas do banco

---

## Exemplo de Execução

```bash
Titular: Luiz Fernando
Agência: 1
Número: 1
Saldo: 100.00

Titular: Fernanda Almeida
Agência: 1
Número: 2
Saldo: 4900.00

Banco: Nubank, Conta: 3, Cliente: Luiz Fernando
Banco: Nubank, Conta: 4, Cliente: Fernanda Almeida
