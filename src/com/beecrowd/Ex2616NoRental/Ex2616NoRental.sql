SELECT c.id, c.name from customers c
full outer join locations l
on l.id_customers = c.id
where l.locations_date is null
order by c.id;