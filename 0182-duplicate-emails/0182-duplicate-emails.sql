# Write your MySQL query statement below
SELECT email from person 
GROUP BY email
having count(email)>1