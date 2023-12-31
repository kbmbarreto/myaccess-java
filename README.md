# MyAccess v2

<p>O MyAccess, em sua nova versão, foi totalmente reconstruido em Java e com novas funções, como, por exemplo, a 
criptografia das senhas armazenadas dos usuários, impossibilitando que as mesmas sejam visualizadas via banco de dados.</p>

## Ferramentas utilizadas

- Java 17
- Maven
- Spring Boot
- Spring Data JPA
- Spring Web
- Spring Security
- Oracle MySQL
- JUnit 4
- OpenAPI (Swagger)
- Lombok

## Preparação do ambiente
Para rodar o projeto, utlize a IDE que você mais se identifique **(no meu caso, utilizo o IntelliJ)**, em seguida, altere o arquivo **application.properties** para que o projeto se adeque ao seu servidor de **banco de dados**:

**Exemplo do arquivo application.properties**:

````java
## Application port
server.port=8003
server.servlet.context-path=/mycar/v1

## default connection pool
spring.datasource.hikari.connectionTimeout=20000
spring.datasource.hikari.maximumPoolSize=5

## Configurações do MySQL database
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/{nomeDoBancoDeDados}
spring.datasource.username={usuario}
spring.datasource.password={senha}
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect

## Path para correção dos Beans
spring.mvc.pathmatch.matching-strategy=ant_path_matcher
````

Em seguida, basta criar um banco de dados no MySql com o comando `Create schema {nomeDoBancoDeDados}`

## Execução de testes unitários

Para limpar os resultados de testes anteriores, utilize o comando: `mvn clean`
Para rodar os testes unitários, utilize o seguinte comando: `mvn test`

## Compilando o projeto e gerando um .jar

Para gerar um arquivo java executável, utilize o seguinte comando: `mvn package`

## Links úteis.

- [Documentação da API](http://localhost:8004/myaccess/v2/swagger-ui/index.html#)
- [Configurar variáveis de ambiente JAVA](https://mauriciogeneroso.medium.com/configurando-java-4-como-configurar-as-vari%C3%A1veis-java-home-path-e-classpath-no-windows-46040950638f)
- [Configurar variáveis de ambiente MAVEN](https://pt.stackoverflow.com/questions/259927/como-configurar-vari%C3%A1veis-de-ambiente-maven-java)
- [Dicas de como configurar o Swagger 2](https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api)
- [Dicas de como configurar o Jenkins](https://medium.com/cwi-software/testes-automatizados-no-jenkins-recursos-plugins-e-dicas-para-aumentar-a-produtividade-1685ffa1e9db#:~:text=Como%20configurar%3A,pasta%20%E2%80%9Csurefire%2Dreports%E2%80%9D.)