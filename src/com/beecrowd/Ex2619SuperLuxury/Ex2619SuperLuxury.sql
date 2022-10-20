select p.name, prv.name, p.price from products p
inner join providers prv
on p.id_providers = prv.id
inner join categories c
on p.id_categories = c.id
where p.price > 1000
and c.name = 'Super Luxury'