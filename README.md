# Biblioteca Digital

Projeto completo de uma aplicação de biblioteca digital desenvolvida com Java e Spring Boot, com interface web em HTML e persistência de dados em MySQL.

## ✅ Funcionalidades

- Cadastro de livros
- Listagem de todos os livros cadastrados
- Integração com banco de dados relacional
- Interface HTML simples e funcional
- API REST criada com Spring Boot

## 🧱 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.1.5
- Spring Data JPA
- MySQL 8.x
- HTML5 + JavaScript (fetch API)
- Maven

## ⚙️ Como executar o sistema localmente

### 1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/biblioteca-digital.git
cd biblioteca-digital
```

### 2. Configure o banco de dados

Crie o banco de dados no MySQL:

```sql
CREATE DATABASE biblioteca_digital;
```

Atualize as credenciais no arquivo `src/main/resources/application.properties`:

```
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA
```

### 3. Execute a aplicação

```bash
mvn spring-boot:run
```

A aplicação será iniciada em:  
`http://localhost:8080`

### 4. Acesse o front-end

Abra no navegador:  
`http://localhost:8080/index.html`

---

## 🗂 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── com.biblioteca/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       └── model/
│   └── resources/
│       ├── static/
│       │   └── index.html
│       └── application.properties
```

---

## ✍️ Autor

Izabella Cardoso  
Projeto desenvolvido como parte da materia Object Oriented Programming da UNIFecaf.
