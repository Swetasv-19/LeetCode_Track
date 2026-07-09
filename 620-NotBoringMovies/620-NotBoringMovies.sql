-- Last updated: 7/9/2026, 10:16:07 AM
SELECT *
FROM Cinema
WHERE id % 2 = 1
  AND description != 'boring'
ORDER BY rating DESC;