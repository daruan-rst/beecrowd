SELECT c.name FROM legal_person p
INNER JOIN customers c
ON p.id_customers = c.id;