SELECT p.name, c.name FROM products p
INNER JOIN categories c
ON pr.id_categories = p.id
WHERE c.id in (1,2,3,6,9)
AND p.amount > 100
ORDER BY c.id ASC
