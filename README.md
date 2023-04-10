# api-produtos-java-spring

# Iniciar
## execute no terminal o comando docker-compose up
## após finalizar este processo a api estará disponível

# Acesso
## acesse a api através de localhost:8080
## com isso verá á página incial

## acesse localhost:8080/produtos
## a aplicação retornará uma lista de produtos vazia []

# Alguns exemplos de utilização

## utilizando o postman por exemplo, você poderá inserir produtos
## faça um post em localhost:8080/produtos e adicione no body um json dessa forma
## { "name": "cadeira", "price": 200.00 }

## para visualizar os produtos cadastrados faça um get em localhost:8080/produtos
## será retornado um json com os produtos cadastros

## para deletar use o delete no localhost:8080/produtos/{id}, insira o id de um produto.
## produto será deletado conforme o id inserido
