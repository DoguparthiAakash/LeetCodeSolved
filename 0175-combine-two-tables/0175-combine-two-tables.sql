SELECT p.firstName,p.lastName,c.city,c.state 
FROM Person p 
  LEFT JOIN Address c 
  ON p.personId = c.personId;