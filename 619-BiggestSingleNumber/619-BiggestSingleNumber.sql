-- Last updated: 8/31/2026, 9:58:14 AM
SELECT MAX(num) as num
FROM(
    SELECT num
    FROM MyNumbers
    GROUP BY num
    HAVING COUNT(num) = 1
) AS ans
