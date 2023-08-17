CREATE TABLE T_CIDADE (
    CODIGO INTEGER NOT NULL PRIMARY KEY,
    NOME VARCHAR(50) NOT NULL,
    HABITANTES BIGINT
);

INSERT INTO T_CIDADE
    (CODIGO, NOME, HABITANTES)
VALUES
    (1, 'São Paulo', 12345678),
    (2, 'Rio de Janeiro', 1122334),
    (3, 'Salvador', 1122334),
    (4, 'Belo Horizonte', 1122334),
    (5, 'Porto Alegre', 1122334),
    (6, 'Porto Velho', 1122334),
    (7, 'Palmas', 1122334),
    (8, 'Recife', 1122334),
    (9, 'Natal', 1122334),
    (10, 'Brasilia', 299),
    (11, 'Fortaleza', 112233455);