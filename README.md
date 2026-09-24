# 🗃️ JPA Pessoa CRUD

Projeto desenvolvido para praticar **JPA (Java Persistence API)** e **Hibernate** na persistência de dados em um banco de dados **MySQL**.

A aplicação utiliza uma entidade `Pessoa` para demonstrar os conceitos fundamentais de **Mapeamento Objeto-Relacional (ORM)** e o uso do `EntityManager` para realizar operações de persistência.

> 📚 Projeto desenvolvido com foco em aprendizado e consolidação dos fundamentos de JPA e Hibernate.

---

## 🎯 Objetivos

O principal objetivo deste projeto é compreender como uma aplicação Java pode se comunicar com um banco de dados utilizando JPA, reduzindo a necessidade de escrever SQL diretamente para operações básicas de persistência.

Durante o desenvolvimento foram praticados:

* Mapeamento de classes Java para tabelas utilizando JPA
* Criação de entidades com `@Entity`
* Definição de identificadores com `@Id`
* Geração automática de IDs com `@GeneratedValue`
* Configuração do `persistence.xml`
* Criação e gerenciamento de `EntityManager`
* Gerenciamento de transações
* Persistência de objetos com `persist()`
* Integração entre Java, JPA, Hibernate e MySQL

---

## 🛠️ Tecnologias utilizadas

| Tecnologia    | Utilização                    |
| ------------- | ----------------------------- |
| ☕ Java        | Linguagem principal           |
| 🔗 JPA        | API de persistência           |
| 🏗️ Hibernate | Implementação da JPA          |
| 🐬 MySQL      | Banco de dados                |
| 📦 Maven      | Gerenciamento de dependências |

---

## 📁 Estrutura do projeto

```text
jpa-pessoa-crud/
│
├── src/
│   └── main/
│       ├── java/
│       │   ├── application/
│       │   │   └── Programa.java
│       │   │
│       │   └── dominio/
│       │       └── Pessoa.java
│       │
│       └── resources/
│           └── META-INF/
│               └── persistence.xml.example
│
├── .gitignore
├── pom.xml
└── README.md
```

### 📌 Principais classes

**`Pessoa.java`**

Entidade responsável por representar os dados de uma pessoa e seu mapeamento para o banco de dados.

**`Programa.java`**

Classe responsável pela execução da aplicação e demonstração das operações de persistência.

**`persistence.xml`**

Arquivo responsável pelas configurações da unidade de persistência, conexão com o banco e propriedades do Hibernate.

---

## 🧩 Mapeamento da entidade

A classe `Pessoa` é transformada em uma entidade JPA através das anotações:

```java
@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // atributos...
}
```

O Hibernate utiliza essas informações para realizar o mapeamento entre o objeto Java e a tabela correspondente no banco de dados.

---

## ⚙️ Configuração

### 1. Clone o projeto

```bash
git clone https://github.com/seu-usuario/jpa-pessoa-crud.git
```

Entre na pasta:

```bash
cd jpa-pessoa-crud
```

### 2. Crie o banco de dados

No MySQL:

```sql
CREATE DATABASE aulajpa;
```

### 3. Configure o `persistence.xml`

O projeto disponibiliza um arquivo de exemplo:

```text
persistence.xml.example
```

Faça uma cópia e renomeie para:

```text
persistence.xml
```

Depois configure suas credenciais do MySQL:

```xml
<property name="jakarta.persistence.jdbc.url"
          value="jdbc:mysql://localhost:3306/aulajpa"/>

<property name="jakarta.persistence.jdbc.user"
          value="seu_usuario"/>

<property name="jakarta.persistence.jdbc.password"
          value="sua_senha"/>
```

> ⚠️ Não envie suas credenciais reais para o GitHub.

---

## ▶️ Executando o projeto

Após configurar o banco e o `persistence.xml`:

1. Abra o projeto na IDE.
2. Verifique se o MySQL está em execução.
3. Execute a classe:

```text
application.Programa
```

O Hibernate será responsável por criar/atualizar a estrutura da tabela de acordo com o mapeamento da entidade.

Com a configuração:

```properties
hibernate.hbm2ddl.auto=update
```

o Hibernate pode atualizar automaticamente o schema durante o desenvolvimento.

---

## 🔄 Fluxo básico da aplicação

O funcionamento básico segue este fluxo:

```text
Programa
   ↓
EntityManagerFactory
   ↓
EntityManager
   ↓
Transação
   ↓
persist(Pessoa)
   ↓
Hibernate
   ↓
MySQL
```

Exemplo de persistência:

```java
EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("aulajpa");

EntityManager em = emf.createEntityManager();

em.getTransaction().begin();

em.persist(pessoa);

em.getTransaction().commit();

em.close();
emf.close();
```

---

## 🗄️ Banco de dados

O banco utilizado no projeto é:

```text
aulajpa
```

A entidade `Pessoa` é persistida pelo Hibernate em uma tabela correspondente.

O ID utiliza:

```java
@GeneratedValue(strategy = GenerationType.IDENTITY)
```

permitindo que o próprio banco seja responsável pela geração automática dos identificadores.

---

## 🔐 Segurança

O arquivo de configuração contendo as credenciais do banco **não deve ser versionado**.

Por isso, o projeto utiliza:

```text
persistence.xml.example
```

como modelo de configuração.

O arquivo real:

```text
persistence.xml
```

deve permanecer no `.gitignore`.

Exemplo:

```gitignore
src/main/resources/META-INF/persistence.xml
```

---

## 📚 Conceitos praticados

Este projeto serviu como introdução prática aos seguintes conceitos:

**Java → JPA → Hibernate → JDBC → MySQL**

A ideia é compreender primeiro os fundamentos da persistência com JPA antes de utilizar abstrações mais avançadas, como o **Spring Data JPA**.

---

## 👨‍💻 Autor

Projeto desenvolvido por **Pedro Henrique** como parte dos estudos de **Java, Banco de Dados, JPA e Hibernate**.

---

⭐ Projeto desenvolvido para fins educacionais e de prática.
