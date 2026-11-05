# 📚 Material de Estudo: Desenvolvimento, Arquitetura e Versionamento de uma API IoT em Spring Boot e MySQL

Este documento serve como um guia de referência e registro de aprendizado para a construção e o controle de versão de uma aplicação backend desenvolvida em Java.

---

## 1. Arquitetura e Configuração do Ambiente

O projeto foi construído utilizando as ferramentas mais modernas do ecossistema Java para aplicações corporativas e web:
- **Linguagem:** Java
- **Framework Principal:** Spring Boot
- **Banco de Dados Relacional:** MySQL (utilizando a porta padrão local ajustada para `3307` e banco nomeado como `minha_api_db`)
- **Gerenciador de Dependências e Build:** Maven (`pom.xml`)

### Configuração de Conexão (`application.properties`)
A conexão entre a aplicação Spring Boot e o banco de dados MySQL é declarada no arquivo `application.properties`. Abaixo estão os parâmetros utilizados e suas funções:

```properties
# URL de conexão JDBC apontando para o MySQL local, definindo o fuso horário e desativando SSL para testes
spring.datasource.url=jdbc:mysql://localhost:3307/minha_api_db?useSSL=false&serverTimezone=UTC

# Credenciais de acesso ao servidor MySQL
spring.datasource.username=root
spring.datasource.password=351521

# Driver JDBC responsável por fazer a ponte entre o Java e o MySQL
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Configurações do Hibernate / JPA para gerenciar o esquema do banco de dados automaticamente
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect