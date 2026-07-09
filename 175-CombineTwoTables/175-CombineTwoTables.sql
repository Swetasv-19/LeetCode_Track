-- Last updated: 7/9/2026, 10:18:10 AM
SELECT firstName, lastName, city, state
FROM Person
LEFT JOIN Address USING (personId);