-- Last updated: 7/9/2026, 10:16:12 AM
# Write your MySQL query statement below

select customer_number
from orders
group by customer_number
order by count(*) DESC limit 1;