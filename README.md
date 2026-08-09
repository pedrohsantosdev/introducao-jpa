JPA Pessoa CRUD

Projeto de estudo utilizando JPA (Java Persistence API) com Hibernate como provider, para persistência de dados em um banco MySQL. O objetivo é praticar o mapeamento objeto-relacional (ORM) e operações básicas de persistência a partir de uma entidade Pessoa.

🎯 Objetivo

Este projeto faz parte de um percurso de estudos em Java, com foco em bancos de dados e persistência. Aqui são aplicados os conceitos de:

Mapeamento de entidades com anotações JPA (@Entity, @Id, @GeneratedValue)
Configuração de persistence.xml
Uso de EntityManagerFactory e EntityManager
Operações de persistência (persist) dentro de transações
🛠️ Tecnologias utilizadas
Java
JPA (Java Persistence API)
Hibernate (implementação JPA)
MySQL
📁 Estrutura do projeto
src/
├── main/
│   ├── java/
│   │   ├── dominio/
│   │   │   └── Pessoa.java
│   │   └── application/
│   │       └── Programa.java
│   └── resources/
│       └── META-INF/
│           └── persistence.xml.example
⚙️ Como executar
Pré-requisitos
JDK instalado
MySQL instalado e rodando
Maven (ou dependências JPA/Hibernate configuradas manualmente)
Passos
Clone o repositório:
bash
   git clone https://github.com/seu-usuario/jpa-pessoa-crud.git
Crie um banco de dados no MySQL (o nome deve bater com o configurado no persistence.xml):
sql
   CREATE DATABASE aulajpa;
Copie o arquivo de exemplo de configuração e renomeie:
bash
   cp src/main/resources/META-INF/persistence.xml.example src/main/resources/META-INF/persistence.xml
Edite o persistence.xml com suas credenciais do MySQL (usuário, senha e URL do banco).
Execute a classe Programa.java. O Hibernate criará automaticamente a tabela Pessoa (graças à propriedade hibernate.hbm2ddl.auto=update) e inserirá os registros de exemplo.
📌 Observações
O arquivo persistence.xml não é versionado por conter credenciais sensíveis. Utilize o persistence.xml.example como base.
O projeto utiliza GenerationType.IDENTITY para geração automática de IDs pelo banco.
🚧 Próximos passos
Implementar operações de leitura, atualização e remoção (CRUD completo)
Adicionar tratamento de exceções
Migrar para Spring Data JPA futuramente

Projeto desenvolvido para fins de estudo e prática de JPA/Hibernate.
