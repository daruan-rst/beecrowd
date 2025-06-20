SELECT
    CONCAT(
        SUBSTRING(n.cpf, 1, 3), '.',
        SUBSTRING(n.cpf, 4, 3), '.',
        SUBSTRING(n.cpf, 7, 3), '-',
        SUBSTRING(n.cpf, 10, 2)
    ) AS CPF
FROM customers c
INNER JOIN natural_person n ON c.id = n.id_customers