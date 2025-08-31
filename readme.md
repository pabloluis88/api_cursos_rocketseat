# 🎓 API de Cursos

Uma API REST desenvolvida em **Spring Boot** para gerenciamento de cursos, com banco de dados H2 em memória.

## 📋 Funcionalidades

- ✅ Criar novos cursos
- ✅ Listar todos os cursos
- ✅ Buscar curso por ID
- ✅ Excluir cursos
- ✅ Atualizar cursos 
- 🚧 Filtros de busca (em desenvolvimento)
- 🚧 Toggle de status ativo/inativo (em desenvolvimento)

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3.5.5**
- **Spring Data JPA**
- **Banco H2** (em memória)
- **Lombok**
- **Maven**

## 🚀 Como Executar

### Pré-requisitos
- Java 17 ou superior
- Maven 3.6+

### Passos para execução

1. **Clone o repositório:**
```bash
git clone https://github.com/SEU_USUARIO/cursos.git
cd cursos
```

2. **Execute a aplicação:**
```bash
mvn spring-boot:run
```

3. **Acesse a aplicação:**
- API: `http://localhost:8080`
- Console H2: `http://localhost:8080/h2-console`

### Configuração do Console H2
- **JDBC URL:** `jdbc:h2:mem:testdb`
- **Username:** `sa`
- **Password:** _(deixar vazio)_

## 📚 Endpoints da API

### 📝 Criar Curso
```http
POST /cursos
Content-Type: application/json

{
  "name": "Spring Boot Fundamentals",
  "category": "Programação",
  "active": "S"
}
```

### 📖 Listar Todos os Cursos
```http
GET /cursos
```

### 🔍 Buscar Curso por ID
```http
GET /cursos/{id}
```

### 🗑️ Excluir Curso
```http
DELETE /cursos/{id}
```

### 🗑️ Atualizar Curso
```http
PUT /cursos/{id}
```

## 📦 Estrutura do Projeto

```
src/
├── main/
│   ├── java/
│   │   └── br/com/projeto/cursos/
│   │       ├── controller/
│   │       │   └── CursosController.java
│   │       ├── entities/
│   │       │   └── Cursos.java
│   │       ├── repository/
│   │       │   └── CursosRepository.java
│   │       ├── service/
│   │       │   └── CursosService.java
│   │       └── CursosApplication.java
│   └── resources/
│       └── application.properties
└── test/
```

## 🗂️ Modelo de Dados

### Entidade Curso

| Campo | Tipo | Descrição |
|-------|------|-----------|
| `id` | Long | Identificador único (auto-incremento) |
| `name` | String | Nome do curso |
| `category` | String | Categoria do curso |
| `active` | String | Status do curso (S/N) |
| `created_at` | LocalDateTime | Data/hora de criação |
| `updated_at` | LocalDateTime | Data/hora da última atualização |

## 🧪 Testando com Postman

### Exemplo de requisições:

1. **Criar curso:**
```json
POST http://localhost:8080/cursos
{
  "name": "React.js Completo",
  "category": "Frontend",
  "active": "S"
}
```

2. **Listar cursos:**
```json
GET http://localhost:8080/cursos
```

3. **Buscar por ID:**
```json
GET http://localhost:8080/cursos/1
```

## 🔧 Configurações

### application.properties
```properties
# Configuração do banco H2
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

# Configuração do JPA/Hibernate
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Console do H2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

## 🏗️ Próximas Funcionalidades

- [ ] Endpoint PATCH para toggle de status
- [ ] Filtros de busca por nome e categoria
- [ ] Validações de entrada
- [ ] Tratamento de exceções customizado
- [ ] Documentação com Swagger
- [ ] Testes unitários

## 🤝 Como Contribuir

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor

Desenvolvido com ❤️ por **Pablo Leite**

---

⭐ **Se este projeto te ajudou, deixe uma estrela!**