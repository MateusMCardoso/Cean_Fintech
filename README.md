# Cean: Gestor Financeiro Pessoal - Fintech

![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellowgreen?style=for-the-badge)
![Java](https://img.shields.io/badge/Java-17+-orange?style=for-the-badge&logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge&logo=spring)
![Maven](https://img.shields.io/badge/Maven-4.0-blue?style=for-the-badge&logo=apache-maven)

Um projeto de aplicação full-stack para gerenciamento de finanças pessoais, focado na aplicação de conceitos sólidos de Programação Orientada a Objetos, Design Patterns e arquitetura de software limpa.

---

## 🏛️ Arquitetura do Projeto

Este projeto adota uma arquitetura Cliente-Servidor com uma clara separação de responsabilidades, preparando o terreno para um sistema robusto e escalável.

* **💻 Back-end (Este Repositório):** Construído com **Java** e **Spring Boot**, é o cérebro da aplicação. Responsável por toda a lógica de negócio, regras de validação e persistência de dados. Ele expõe os dados e funcionalidades de forma segura através de uma **API REST**.

* **🎨 Front-end (Implementação Futura):** Será desenvolvido com **HTML, CSS, Bootstrap** e **JavaScript**. Será responsável por toda a interface e experiência do usuário (UI/UX), consumindo os dados fornecidos pela API REST do back-end.

---

## ✨ Funcionalidades e Design

* **Modelo de Dados Robusto e Imutável:**
    * Classes de modelo (`User`, `Category`, `Transactions`, etc.) construídas para serem imutáveis, garantindo a integridade dos dados.
    * Uso intensivo do **Padrão Builder** para uma criação de objetos legível, segura e flexível.

* **Estrutura de Herança Clara:**
    * Utilização de uma superclasse `abstract` (`Transactions`) para modelar o comportamento comum entre `Expense` (Despesas) e `Revenue` (Receitas).

* **Encapsulamento Forte:**
    * Todos os atributos de modelo são `private final`, com acesso controlado exclusivamente através de `getters`.

* **Tipos de Dados Seguros:**
    * `Enum` avançados para garantir a consistência de tipos como status, métodos de pagamento e tipos de transação.
    * `BigDecimal` para todos os valores monetários, evitando erros de precisão de ponto flutuante.

---

## 🔧 Stack de Tecnologias

### **Back-end**
* **Linguagem:** `Java 17+`
* **Framework Principal:** `Spring Boot 3.x`
* **Gerenciador de Dependências:** `Maven`

### **Front-end (Planejado)**
* **Estrutura:** `HTML5`
* **Estilização:** `CSS3`, `Bootstrap 5`
* **Interatividade:** `JavaScript (ES6+)`

---

## 🗺️ Roadmap do Projeto

-   [x] Modelagem de Dados e Estrutura de Classes com POO avançado.
-   [ ] **(Próximo Passo)** Desenvolvimento da API REST (Endpoints CRUD para Transações).
-   [ ] Integração com um Banco de Dados (JPA/Hibernate com H2 ou PostgreSQL).
-   [ ] Implementação da camada de Serviços para a lógica de negócio.
-   [ ] Construção da interface do usuário (Front-end).
-   [ ] Implementação de autenticação e segurança com Spring Security.

---

## 👤 Autor

Mateus Cardoso

* [LinkedIn](https://www.linkedin.com/in/mateus-cardoso-dev)

* [GitHub](https://github.com/MateusMCardoso)

---
