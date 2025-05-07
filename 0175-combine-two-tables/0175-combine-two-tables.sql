# Write your MySQL query statement below
select p.firstname,p.lastname,s.city , s.state from Person p  left join  Address s on p.personId = s.personId;