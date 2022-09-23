select prd.name, prv.name, cat.name
from products prd
inner join providers prv
on prd.id_providers = prv.id
inner join categories cat
on prd.id_categories = cat.id
where cat.name = 'Imported'
and prv.name = 'Sansul SA';