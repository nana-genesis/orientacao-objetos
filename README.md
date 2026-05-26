# Orientação a Objetos - Herança e Classes Abstratas

## Estrutura do Projeto
Pessoa (abstrata)
├── PessoaFisica (concreta)
└── PessoaJuridica (concreta)

text

## Propriedades Comuns (classe Pessoa)
- nome
- endereco
- telefone

## Propriedades Específicas

### Pessoa Física
- cpf
- rg
- dataNascimento

### Pessoa Jurídica
- cnpj
- inscricaoEstadual
- razaoSocial
- nomeFantasia

## Como executar

bash
javac *.java
java Main

### Conceitos demonstrados
Classe abstrata

Herança (extends)

Construtores com super()

Métodos abstratos e @Override

Encapsulamento (private + getters/setters)

Polimorfismo
