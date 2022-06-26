select categories.name, sum(products.amount)
from products
inner join categories
on categories.id = products.id_categories
where products.amount > 0
group by categories.name