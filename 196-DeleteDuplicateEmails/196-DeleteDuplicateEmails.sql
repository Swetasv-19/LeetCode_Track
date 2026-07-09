-- Last updated: 7/9/2026, 10:17:51 AM
delete p1 from person p1,person p2 
where p1.email=p2.email and p1.id>p2.id;