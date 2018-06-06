# PW-2018-1

## Para executar o Tomcat

`mvn tomcat7:run`

## Para executar o Derby

`mvn exec:java@derby-start`

## Arquivos

`pom.xml` - Arquivo de configuração do projeto Maven.

## Banco de Dados

### JDBC

URL: `jdbc:derby://localhost:1527/vendadb`

Usuário: `app`

Senha: `app`

### Tabelas

`
CREATE TABLE VENDA (
  CODIGO VARCHAR(100),
  PRODUTO VARCHAR(100),
  QUANTIDADE INTEGER
);
`