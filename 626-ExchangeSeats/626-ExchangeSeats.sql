-- Last updated: 7/9/2026, 10:16:05 AM
SELECT
    CASE
        WHEN id % 2 = 1
             AND id + 1 IN (SELECT id FROM Seat)
        THEN id + 1

        WHEN id % 2 = 0
        THEN id - 1

        ELSE id
    END AS id,
    student
FROM Seat
ORDER BY id;