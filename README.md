# 📚 Sistema de Gerenciamento de Biblioteca

Este projeto foi desenvolvido como meu **primeiro sistema acadêmico**, durante o **terceiro período do curso de Ciência da Computação na UEPB (Universidade Estadual da Paraíba)**.

O objetivo principal foi aplicar, na prática, os conceitos fundamentais de **Programação Orientada a Objetos (POO)** utilizando Java, simulando o funcionamento básico de uma biblioteca.

---

## 🎯 Sobre o Projeto

O sistema permite o gerenciamento de:

* 📖 Livros
* 👥 Usuários
* 🔄 Empréstimos

Toda a lógica foi estruturada para refletir um cenário real, onde diferentes tipos de usuários possuem **regras específicas de empréstimo**.

---

## 🚀 Funcionalidades

* ✔ Cadastro de usuários (Aluno, Funcionário e Professor)
* ✔ Cadastro de livros
* ✔ Empréstimo de livros com validação de disponibilidade
* ✔ Devolução de livros
* ✔ Relatório geral do sistema

---

## 🧠 Inteligência de Negócio

A classe `Biblioteca` atua como o **núcleo do sistema**, sendo responsável por:

* Gerenciar coleções de usuários e livros
* Controlar empréstimos ativos
* Garantir consistência nas operações
* Aplicar regras de disponibilidade de livros

---

## 🛠️ Conceitos de POO Aplicados

Este projeto foi desenvolvido com foco nos principais pilares da orientação a objetos:

### 🔹 Encapsulamento

Uso de modificadores de acesso (`private`, `protected`) para proteger os dados e garantir integridade.

### 🔹 Herança

Estrutura hierárquica de usuários:

```
Usuario (classe abstrata)
   ↑
Funcionario
   ↑
Professor
```

Além disso:

```
Usuario
   ↑
Aluno
```

📌 **Observação:** A classe `Professor` herda de `Funcionario`, reaproveitando atributos e comportamentos.

---

### 🔹 Polimorfismo

Cada tipo de usuário possui seu próprio comportamento para:

```java
int prazoDevolucao();
```

Implementado através da interface:

```java
UserPolicy
```

---

### 🔹 Abstração

A classe `Usuario` define comportamentos genéricos que são implementados pelas subclasses.

---

### 🔹 Associação entre Classes

* `Emprestimo` conecta `Usuario` e `Livro`
* `Biblioteca` gerencia todas as entidades
* Uso de `List` para armazenamento dinâmico

---

## 👥 Tipos de Usuários

| Tipo        | Prazo de Devolução |
| ----------- | ------------------ |
| Aluno       | 15 dias            |
| Funcionário | 7 dias             |
| Professor   | 30 dias            |

---

## 📂 Estrutura do Projeto

```bash
biblioteca/
│
├── Usuario.java
├── Aluno.java
├── Funcionario.java
├── Professor.java
│
├── Livro.java
├── Emprestimo.java
│
├── Biblioteca.java
├── Menu.java
│
└── UserPolicy.java
```

## 🖥️ Interface do Sistema

O sistema roda via terminal com um menu interativo:

```
=== MENU ===
1 - Adicionar usuário
2 - Adicionar livro
3 - Emprestar livro
4 - Devolver livro
5 - Relatório
0 - Sair
```

---

## 🔮 Melhorias Futuras

* Persistência em banco de dados
* Interface gráfica (JavaFX ou Swing)
* Sistema de multas por atraso
* Busca por ID (ao invés de nome)
* Aplicação de padrões de projeto (Strategy / Factory)

---

## 📌 Considerações Finais

Este projeto representa um marco importante na minha formação, sendo o **primeiro sistema completo desenvolvido durante a graduação**, consolidando na prática os conceitos teóricos de orientação a objetos.

---

## ⭐ Apoie o Projeto

Se este projeto te ajudou ou serviu como referência, deixe uma ⭐ no repositório!

---

## 👨‍💻 Autor

Desenvolvido por [Jose Netto](https://www.linkedin.com/in/josednetto/)
