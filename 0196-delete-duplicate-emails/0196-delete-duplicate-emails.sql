DELETE FROM Person
WHERE Id NOT IN (
    SELECT * FROM (
        SELECT MIN(Id)
        FROM Person
        GROUP BY Email
    ) AS keep_ids
);
