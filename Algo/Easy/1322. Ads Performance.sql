# Write your MySQL query statement below

WITH T1 AS(
    SELECT distinct(ad_id) FROM Ads
), 
T2 AS(
    SELECT ad_id, count(action) as total_clicks
    FROM Ads
    WHERE action = 'Clicked'
    GROUP BY ad_id
),
T3 AS(
    SELECT T1.ad_id, 
    CASE
        WHEN T2.total_clicks is null THEN 0
        ELSE T2.total_clicks
    END AS total_clicks
    FROM T1 LEFT JOIN T2 ON T1.ad_id = T2.ad_id
),
T4 AS(
    SELECT ad_id, count(action) as total_views
    FROM Ads
    WHERE action = 'Viewed'
    GROUP BY ad_id
),
T5 AS(
    SELECT T1.ad_id,
    CASE
        WHEN T4.total_views is null THEN 0
        ELSE T4.total_views
    END AS total_views
    FROM T1 LEFT JOIN T4 ON T1.ad_id = T4.ad_id
)


SELECT T3.ad_id, 
CASE
    WHEN T3.total_clicks = 0 and T5.total_views = 0 THEN 0.00
    ELSE round((T3.total_clicks/(T3.total_clicks + T5.total_views)*100), 2)
END AS ctr
FROM T3 JOIN T5 ON T3.ad_id = T5.ad_id
ORDER BY 2 DESC, 1 ASC;
