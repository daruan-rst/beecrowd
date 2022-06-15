select prdc.name, prv.name from products prdc
inner join providers prv on prdc.id_providers = prv.id
where prdc.id_categories = 6