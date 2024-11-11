# Write your MySQL query statement below
#select name  where population>=25000000 and 3000000<=area
select name,population,area from World where area>=3000000 or population>=25000000