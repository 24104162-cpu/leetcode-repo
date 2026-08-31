-- Last updated: 8/31/2026, 9:58:10 AM
# Write your MySQL query statement below
SELECT *
FROM cinema c
WHERE c.id%2=1
AND
c.description !='boring'
ORDER BY c.rating DESC;