-- Last updated: 7/9/2026, 10:18:00 AM
SELECT Email FROM Person p
GROUP BY Email
HAVING COUNT(*) > 1;