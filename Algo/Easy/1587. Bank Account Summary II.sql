# Write your MySQL query statement below
WITH T AS(
    SELECT name, sum(tr.amount) total_amount
    FROM Users u JOIN Transactions tr ON u.account = tr.account
    GROUP BY name
)

SELECT name, T.total_amount as balance
FROM T
WHERE T.total_amount>10000;