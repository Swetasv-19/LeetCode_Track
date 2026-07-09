-- Last updated: 7/9/2026, 10:18:03 AM
SELECT DISTINCT num AS ConsecutiveNums
FROM Logs
WHERE (id + 1, num) IN (SELECT id, num FROM Logs)
  AND (id + 2, num) IN (SELECT id, num FROM Logs);