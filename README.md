
# Consulta de Repositórios através da API do GITHUB Desafio Técnico na Selectbr

Basicamente você irá inserir seu nome de usuário do github, e a aplicação irá retornar os dados dos seus repositórios e a descrição.


## Documentação da API



#### Você irá inserir essa URL no Postman:

```http
  GET http://localhost:8080/api/git?username={seu-nome-de-usuario}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `username`      | `string` | **Obrigatório**. passar seu nome de usuário do github |




## Demonstração

Logo após inserir isso no postman, provavelmente irá ficar pendente, 

![Postman](https://cdn.discordapp.com/attachments/910358683110760468/1169272738192568330/image.png?ex=6554cd18&is=65425818&hm=092460395be020666960aaafda81210373c5aecf02ee67247f778f23d3cb772e&)

## Clicando no githubService e parando a aplicação na sua IDE, ele irá retornar todos os dados de repositório do seu usuário como Json no postman.

![IDE](https://cdn.discordapp.com/attachments/910358683110760468/1169273131362439288/image.png?ex=6554cd76&is=65425876&hm=cc06aa5f107bcf562a48d1e79c0d6679290e2836511195eb9359e630486a9213&) 

## Exemplo de Retorno

![Postman](https://cdn.discordapp.com/attachments/910358683110760468/1169273881937334344/image.png?ex=6554ce29&is=65425929&hm=70e11d58e8278a5c7bf5db2fd6d05512ad1597b8e843c6c3d1ec5ade07f3fd65&) 



## Stack utilizada

**Front-end:** React, Reactstrap, Axios

**Back-end:** Java, Springboot

