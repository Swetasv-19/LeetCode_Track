-- Last updated: 7/9/2026, 10:15:01 AM
# Write your MySQL query statement below
WITH new_table AS (
    SELECT 
        person_name,
        SUM(weight) OVER (ORDER BY turn) AS cumulative_weight
    FROM Queue
)
SELECT 
    person_name
FROM new_table
WHERE cumulative_weight <= 1000
ORDER BY cumulative_weight DESC
LIMIT 1;