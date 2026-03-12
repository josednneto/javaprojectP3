# Sistema de Gerenciamento de Biblioteca 📚

Este projeto foi desenvolvido como parte do curso de **Ciência da Computação**, com foco na aplicação prática de conceitos fundamentais de **Programação Orientada a Objetos (POO)** utilizando a linguagem Java.

## 🚀 Funcionalidades
O sistema utiliza uma arquitetura centralizada onde a classe **Biblioteca** gerencia toda a inteligência do negócio:
- **Gestão de Cadastro:** Controle central de usuários (**Aluno** e **Professor**) e do acervo de **Livros**.
- **Movimentações:** Lógica completa de **Empréstimo** e **Devolução** processada pela biblioteca.
- **Controle de Fluxo:** Mediação entre as entidades e registro de transações.

## 🛠️ Conceitos de POO Aplicados
Para garantir um código limpo e escalável, foram utilizados os seguintes pilares:
- **Abstração e Encapsulamento:** Proteção dos estados dos objetos e métodos de acesso controlados.
- **Herança e Polimorfismo:** Implementados na hierarquia de `Usuario`, permitindo tratamentos genéricos para `Aluno` e `Professor`.
- **Composição e Agregação:** A classe `Biblioteca` atua como um agregador que contém e gerencia as listas de livros e usuários.

## 📂 Estrutura do Projeto
- `Main.java`: Ponto de entrada que demonstra o funcionamento das operações.
- `Biblioteca.java`: Controlador central responsável por adicionar usuários/livros e processar movimentações.
- `Usuario.java`, `Aluno.java`, `Professor.java`: Modelagem da hierarquia de perfis do sistema.
- `Livro.java`: Entidade que representa os itens do acervo.
- `Emprestimo.java`: Registro detalhado das transações realizadas.

---
Desenvolvido por [Jose Netto](https://www.linkedin.com/in/josednetto/)
