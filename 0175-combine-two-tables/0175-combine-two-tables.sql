select p.firstName,p.lastName,c.city,c.state 
from Person p left join Address c on p.personId = c.personId;