## Como criar um repository e uma entity no Spring Boot

* O tutorial irá ensinar como criar um repository e uma entity no Spring Boot.
* Um repository é uma interface que representa um conjunto de dados em um banco de dados.
* Uma entity é uma classe que representa um registro de dados em um banco de dados.

**Passo 1:** Criar uma pasta chamada `repository`

* Criar uma nova pasta chamada `repository` no diretório `src/main/java`.
* Essa pasta irá conter os arquivos de código para o repository.

**Passo 2:** Criar uma interface java chamada `UsuarioRepository`

* Criar uma nova interface java chamada `UsuarioRepository` no diretório `repository`.
* A interface deve estender a interface `CrudRepository` do Spring Data JPA.
* A interface deve ter métodos para acessar e manipular dados de usuários no banco de dados.

**Passo 3:** Adicionar dependências JPA e MySQL

* Adicionar as dependências JPA e MySQL ao arquivo `pom.xml`.
* As dependências JPA fornecem o suporte para o Spring Data JPA.
* A dependência MySQL fornece o driver JDBC para se conectar ao banco de dados MySQL.

**Passo 4:** Configurar o `application.yaml`

* Configurar o arquivo `application.yaml` para conectar ao banco de dados MySQL.
* O arquivo `application.yaml` deve conter as seguintes propriedades:
    * `spring.datasource.url`: A URL do banco de dados MySQL.
    * `spring.datasource.username`: O nome de usuário do banco de dados MySQL.
    * `spring.datasource.password`: A senha do banco de dados MySQL.

**Passo 5:** Testar a conexão com o banco de dados

* Executar a aplicação para testar a conexão com o banco de dados.
* Se a conexão for bem-sucedida, o console irá imprimir a seguinte mensagem:

```
Connected to database
```

**Passo 6:** Criar a entity `UsuarioEntity`

* Criar uma nova classe java chamada `UsuarioEntity` no diretório `entities`.
* A classe deve representar um registro de dados de usuário no banco de dados.
* A classe deve ter os seguintes atributos:
    * `id`: O ID do usuário.
    * `nome`: O nome do usuário.
    * `email`: O e-mail do usuário.

**Passo 7:** Usar a entity `UsuarioEntity`

* Criar um novo controller para acessar os dados de usuários no banco de dados.
* O controller deve usar a interface `UsuarioRepository` para acessar os dados de usuários.

**Passo 8:** Executar o script SQL

* Executar o script SQL `script.sql` para criar o banco de dados e a tabela de usuários.
