SELECT p.name as name, c.name as name FROM products p
INNER JOIN categories c
ON p.id_categories = c.id
WHERE c.id in (1,2,3,6,9)
AND p.amount > 100
ORDER BY c.id ASC;