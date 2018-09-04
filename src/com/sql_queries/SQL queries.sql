SELECT country.name, COUNT(region.country_id)
FROM country INNER JOIN region
ON country.id = region.country_id
GROUP BY country.name
ORDER BY COUNT(region.country_id) DESC
LIMIT 5;

SELECT country.name, COUNT(city.id)
FROM country INNER JOIN region
ON country.id = region.country_id
INNER JOIN city
ON region.id = city.region_id
GROUP BY country.name
LIMIT 5;


SELECT country.name, COUNT(city.id)
FROM country INNER JOIN region
ON country.id = region.country_id
INNER JOIN city
ON region.id = city.region_id
GROUP BY country.name
LIMIT 5;