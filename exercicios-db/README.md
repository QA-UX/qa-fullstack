# Exercícios básicos de Banco de Dados em PostgreSQL

## Exercício de Modelagem SQL

1. Crie um banco com nome controle_estoque;
2. Criar um esquema esq_estoque;
3. Criar as seguintes tabelas;
    - clientes (cpf, nome, endereco, cidade, uf, cep, telefone, data_cadastro, data_nascimento);
    - funcionarios (cpf, nome, endereco, cidade, uf, cep, telefone, data_admissao, data_nascimento); 
    - produtos (codigo_produto, nome, unidade, quantidade, preco_unitario, estoque_minimo, estoque_maximo); -- nome deve ser UNIQUE 
    - vendas (codigo_venda, data_venda, cpf_cliente, cpf_funcionario);
    - vendas_itens (codigo_item, codigo_venda, codigo_produto, quantidade_item);
    - bonus (codigo_bonus, cpf_cliente, codigo_venda, bonus); 
    - comissoes (codigo_comissao, cpf_funcionario, codigo_venda, comissao);
4. Criar as chaves estrangeiras que façam os devidos relacionamentos entre as tabelas;

No arquivo de dump, realizar os seguintes SELECT

## Exercício 1
Encontrar filmes que possuem duração maior que 60 minutos
SQL Resposta
```sql
select * from .....
```

## Exercício 2
Encontrar filmes somente da França
SQL Resposta
```sql
select * from .....
```

## Exercício 3
Trazer somente os autores que atuaram de 2018 até o momento
```sql
select * from .....
```

## Exercício 4
Trazer o nome do país que possue a maior taxa de mortalidade
```sql
select * from .....
```

## Exercício 5
Encontrar os países da américa latina
```sql
select * from .....
```

## Exercício 6
Encontrar os paíse que possuem a maior taxa de telefones por habitante
```sql
select * from .....
```