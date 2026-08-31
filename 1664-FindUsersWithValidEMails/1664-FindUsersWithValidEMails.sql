-- Last updated: 8/31/2026, 9:57:04 AM
SELECT 
    user_id,
    name,
    mail
FROM Users
WHERE mail REGEXP '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$'
AND mail LIKE BINARY '%@leetcode.com';