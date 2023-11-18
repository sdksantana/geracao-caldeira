-- Level 01:

-- 1.1:
CREATE TABLE clientes(
id_cliente INTEGER PRIMARY KEY,
nome VARCHAR(50),
email VARCHAR(255),
telefone VARCHAR(11)
)

-- 1.2:
CREATE TABLE produtos(
id_produto INTEGER PRIMARY KEY,
nome VARCHAR(50),
preco numeric(10, 2),
categoria VARCHAR(50)
)

-- 1.3
CREATE TABLE pedidos(
id_pedido INTEGER PRIMARY KEY,
id_cliente INTEGER,
FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
data_pedido DATE,
valor_total numeric(10, 2)
)

-- 1.4:
CREATE TABLE detalhesdopedido(
id_detalhe INTEGER PRIMARY KEY,
id_pedido INTEGER NOT NULL,
FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido),
id_produto INTEGER NOT NULL, 
FOREIGN KEY (id_produto) REFERENCES produtos(id_produto),
quantidade INTEGER
)

-- Registros Clientes:
INSERT INTO clientes VALUES(1,'Pedro','Pedro@gmail.com','519898032')
INSERT INTO clientes VALUES(2,'Juca','Juca@gmail.com','518598032')
INSERT INTO clientes VALUES(3,'Lucas','Lucas@gmail.com','517598032')
INSERT INTO clientes VALUES(4,'Laura','Laura@gmail.com','518998032')

-- Registros Produtos:
INSERT INTO produtos VALUES (1,'Maçã',5.45,'Alimentos')
INSERT INTO produtos VALUES (2,'Maracujá',9.89,'Alimentos')
INSERT INTO produtos VALUES (3,'Quebra-cabeças',75.99,'Jogos')
INSERT INTO produtos VALUES (5,'Jogo de talheres',155.90,'Casa')

-- Registros Pedidos:
INSERT INTO pedidos VALUES (1, 1, '2023-11-17', 201.00)
INSERT INTO pedidos VALUES (2, 1, '2023-11-29', 100.5)
INSERT INTO pedidos VALUES (3, 1, '2023-11-29', 6.27)
INSERT INTO pedidos VALUES (4, 1, '2023-11-29', 11.37)
INSERT INTO pedidos VALUES (6,4,'09-05-2022', 100.5)


-- Registros de Detalhes Do Pedido:
INSERT INTO detalhesdopedido VALUES (1,1,2,3)
INSERT INTO detalhesdopedido VALUES (2,1,1,2)
INSERT INTO detalhesdopedido VALUES (3,1,1,1)
INSERT INTO detalhesdopedido VALUES (4,1,1,2)
INSERT INTO detalhesdopedido VALUES (5,6,1,3)


-- Level 02:

-- 2.1:
SELECT * FROM clientes c 

-- 2.2:
SELECT nome FROM clientes c 

-- 2.3:
SELECT * FROM pedidos WHERE valor_total > 100

-- 2.4:
SELECT * FROM produtos WHERE preco < 50

-- 2.5:
ALTER TABLE clientes  RENAME TO cadastroclientes

-- 2.6:
DELETE FROM produtos p 
WHERE id_produto  = 8

-- 2.7:
SELECT * FROM pedidos p WHERE id_cliente = 1

-- 2.8:
SELECT AVG(preco) AS MediaPreco
FROM produtos p 

-- 2.9:
CREATE TABLE funcionarios(
id_funcionario INTEGER PRIMARY KEY,
nome VARCHAR(255), 
cargo VARCHAR(55),
contratacao DATE
)

-- Registros Funcionarios:
INSERT INTO funcionarios VALUES (1,'Miguel','Vendedor','27-05-2019')
INSERT INTO funcionarios VALUES (6,'Leticia','Gerente','20-08-2010')
INSERT INTO funcionarios VALUES (2,'Guilherme','Vendedor','15-08-2020')
INSERT INTO funcionarios VALUES (5,'Amorim','Contador','15-08-2017')


-- Level 03: 

-- 3.1:
SELECT c.nome, COUNT(*) as conta
FROM cadastroclientes c 
LEFT OUTER JOIN pedidos p 
ON (c.id_cliente = p.id_cliente)
GROUP BY c.id_cliente
HAVING COUNT(*) > 3;

-- 3.2:
SELECT c.nome, SUM(p.valor_total) as soma
FROM cadastroclientes c 
LEFT OUTER JOIN pedidos p 
ON (c.id_cliente = p.id_cliente)
GROUP BY c.id_cliente

-- 3.3:
UPDATE produtos 
SET preco = preco * 1.15

-- 3.4:
SELECT p.nome, COUNT(*) AS quantidade_vendida
FROM produtos p
JOIN detalhesdopedido d ON p.id_produto = d.id_produto
GROUP BY p.nome
ORDER BY quantidade_vendida DESC;

-- 3.5:
SELECT
AVG(preco) AS MediaPreco,
PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY preco) AS MedianaPreco,
STDDEV(preco) AS DesvioPadraoPreco
FROM produtos;

-- 3.6:
SELECT * FROM pedidos p 
WHERE data_pedido  >= '2023-11-18' AND data_pedido < '2023-11-30';

-- 3.7:
SELECT c.nome  FROM cadastroclientes c
LEFT OUTER JOIN pedidos p ON (p.id_cliente = c.id_cliente)
WHERE data_pedido < '2023-11-01';

-- 3.8:
SELECT * FROM produtos ORDER BY preco DESC;

-- 3.9
SELECT p.categoria, COUNT(*) AS categoria_vendida
FROM produtos p
JOIN detalhesdopedido d ON p.id_produto = d.id_produto
GROUP BY p.categoria
ORDER BY categoria_vendida DESC;

