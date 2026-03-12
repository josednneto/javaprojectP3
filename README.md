# Sistema de Gerenciamento de Biblioteca 📚

Este projeto foi desenvolvido como parte do curso de **Ciência da Computação**, com foco na aplicação prática de conceitos fundamentais de **Programação Orientada a Objetos (POO)** utilizando a linguagem Java.

## 🚀 Funcionalidades
O sistema simula a operação básica de uma biblioteca, permitindo:
- Cadastro e gestão de diferentes tipos de usuários (**Aluno** e **Professor**).
- Gerenciamento de acervo com a classe **Livro**.
- Controle de fluxo através da classe **Bibliotecario**.
- Registro de transações via classe **Emprestimo**.

## 🛠️ Conceitos de POO Aplicados
Para garantir um código limpo e escalável, foram utilizados os seguintes pilares:
- **Abstração e Encapsulamento:** Proteção dos dados dos usuários e livros.
- **Herança e Polimorfismo:** Utilizados na modelagem de `Usuario`, `Aluno` e `Professor` para reaproveitamento de lógica.
- **Associação de Classes:** Relacionamento entre livros, empréstimos e usuários.

## 📂 Estrutura do Projeto
- `Main.java`: Ponto de entrada que executa a simulação do sistema.
- `Biblioteca.java`: Classe principal que gerencia o acervo e as regras de negócio.
- `Usuario.java`, `Aluno.java`, `Professor.java`: Estrutura de hierarquia de usuários.
- `Livro.java`: Representação das entidades do acervo.
- `Emprestimo.java`: Lógica de datas e vinculação de exemplares.

---
Desenvolvido por [Jose Netto](https://www.linkedin.com/in/josednetto/)
