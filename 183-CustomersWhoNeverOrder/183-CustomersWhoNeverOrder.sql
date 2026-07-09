-- Last updated: 7/9/2026, 10:17:59 AM
SELECT name AS Customers
FROM customers a
LEFT JOIN orders b
ON a.id = b.customerId
WHERE b.customerId IS NULL;