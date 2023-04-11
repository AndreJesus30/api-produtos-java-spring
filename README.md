# api-produtos-java-spring

# Iniciar
 Execute o arquivo ApplicationCrudProdutos   
 Execute no terminal o comando docker-compose up  
 Após finalizar este processo a api estará disponível

# Acesso
 Acesse a api através de localhost:8080  
 Com isso verá á página incial

#### acesse localhost:8080/produtos 
#### a aplicação retornará uma lista de produtos vazia []  

# Alguns exemplos de utilização

 Utilizando o postman por exemplo, você poderá inserir produtos   
 Faça um post em localhost:8080/produtos e adicione no body um json dessa forma   
## { "name": "cadeira", "price": 200.00 }

 Para visualizar os produtos cadastrados faça um get em localhost:8080/produtos   
 Será retornado um json com os produtos cadastros   

 Para deletar use o delete no localhost:8080/produtos/{id}, insira o id de um produto.   
 Produto será deletado conforme o id inserido   
 
# Health Check
 localhost:9090 para acesso ao prometheus         
 
# DashBoard em tempo real
 localhost:3000 para acesso ao grafana   
 login: admin password: admin    
 No menu lateral clique em search dashboard, já está setado um dashboard chamado JVM (Micrometer)   
 Em qualquer caso pode ser montado o dashboard de sua preferência
 Acesso ao Zipkin em localhost:9411 
 
 ![Grafana](img/print-dashboard-grafana.png)
 

