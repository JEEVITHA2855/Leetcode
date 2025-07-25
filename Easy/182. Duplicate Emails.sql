
SELECT DISTINCT email 
FROM Person 
WHERE email IN (
    SELECT email FROM Person 
    GROUP BY email 
    HAVING COUNT(id) > 1
);
