# Sistema de Gerenciamento de Biblioteca 📚

Este projeto foi desenvolvido durante o terceiro período de **Ciência da Computação na UEPB**. O objetivo principal é a aplicação prática dos pilares da **Programação Orientada a Objetos (POO)** utilizando a linguagem Java para simular a operação real de uma biblioteca.

## 🚀 Funcionalidades e Inteligência de Negócio
O sistema foi estruturado para que a classe **Biblioteca** atue como o controlador central, sendo responsável por:
- **Gestão de Entidades:** Métodos para adicionar e organizar novos usuários e livros no sistema.
- **Movimentações Críticas:** Execução e validação de processos de **Empréstimo** e **Devolução**.
- **Regras de Negócio:** Centralização da lógica de controle, garantindo a integridade dos dados entre livros e usuários.

## 🛠️ Conceitos de POO Aplicados
A arquitetura do projeto explora profundamente as interações entre objetos:

- **Encapsulamento:** Proteção dos atributos das classes através de modificadores de acesso (`private`), utilizando métodos `Getters` e `Setters` para garantir a integridade dos dados.
- **Herança e Reescrita (`@Override`):** Utilização de superclasses para perfis de usuários, onde comportamentos específicos de `Aluno` e `Professor` são refinados através da reescrita de métodos.
- **Polimorfismo:** Capacidade do sistema de tratar diferentes tipos de usuários de forma genérica através da classe base, facilitando a expansão do código.
- **Composição e Agregação:** A classe `Biblioteca` utiliza coleções para gerenciar o acervo e os usuários, demonstrando como objetos complexos são formados por partes menores.
- **Relacionamentos:** Implementação de associações claras entre `Emprestimo`, `Livro` e `Usuario`.

## 📂 Estrutura das Classes
- `Main.java`: Ponto de entrada para execução e testes das funcionalidades.
- `Biblioteca.java`: O controlador do sistema (Adição de dados e controle de estoque/empréstimos).
- `Usuario.java`: Superclasse base para a hierarquia de pessoas no sistema.
- `Aluno.java` & `Professor.java`: Subclasses que herdam de Usuario.
- `Livro.java`: Representação dos itens do acervo.
- `Emprestimo.java`: Classe que vincula um usuário a um livro com regras de data e status.

---
Desenvolvido por [Jose Netto](https://www.linkedin.com/in/josednetto/)
