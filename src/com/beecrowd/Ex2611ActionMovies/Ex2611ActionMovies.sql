Select movies.id, name from movies
join genres
on genres.id= movies.id_genres
where genres.description = 'Action'
