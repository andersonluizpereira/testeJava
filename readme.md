# teste_java
1-) Quando o numero for divisivel por 3 retornar Brasil, 5 retornar prev, ambos Previdencia.

2-) Dado uma lista Abaixo, preciso que retorne o JSON das pessoas cuja a idade seja maior ou igual a 18 anos, com os campos nome e email.

                     [
                       {
                           "idade": 35,
                           "nome": "Joao",
                           "email": "joao@joao.com"
                       },
                       {
                           "idade": 18,
                           "nome": "Maria",
                           "email": "maria@maria.com"
                       },
                       {
                           "idade": 15,
                           "nome": "Diego",
                           "email": "diego@diego.com"
                          
                       }
                    ]

3-) (Regex) Dado o comando: create table author (id number, name string, age number, city string, state string, country string)
Crie um objeto chamado "database".
Dentro do objeto "database", crie um objeto chamado "tables".
Dentro do objeto "tables", crie um objeto com o nome da tabela.
Dentro do objeto criado com o nome da tabela, crie um objeto chamado "columns", onde as chaves são representadas pelo nome da coluna e o valor pelo tipo.
Dentro do objeto criado com nome da tabela, crie um array chamado "data".
Exiba o conteúdo do objeto "database"

Saida

```
{
    "tables": {
        "author": {
            "columns": {
                "id": "number",
                "name": "string",
                "age": "number",
                "city": "string",
                "state": "string",
                "country": "string"
            },
            "data": []
        }
    }
}
```
