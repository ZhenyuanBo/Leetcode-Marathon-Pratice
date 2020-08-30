# Write your MySQL query statement below
WITH T AS(
    SELECT c.country_name, avg(weather_state) avg_weather_state
    FROM Countries c JOIN Weather w ON c.country_id = w.country_id and
    Year(day) = 2019 and Month(day)=11
    GROUP BY c.country_id
    )

SELECT T.country_name,
CASE
    WHEN avg_weather_state <=15 THEN 'Cold'
    WHEN avg_weather_state >=25 THEN 'Hot'
    ELSE 'Warm'
END AS weather_type
FROM T