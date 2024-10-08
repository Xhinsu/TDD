Hibernate
Hibernate supports mapping of java classes to database tables and vice versa

Sessions: Stores work and at end transfers to DB. It is confined to single unit of work
grouping of queries/ transactions in one session instead of sending update, insert, select one at a time.

Step 1: start session
Step 2: Do work
Step 3: Flush it

Hibernate revolves around session factory
Create StandardServiceRegistry registry to align our hibernate settings and build it.
![image](https://github.com/user-attachments/assets/a97772d5-302b-4c9b-8677-2a2f2ee2ebc4)

![image](https://github.com/user-attachments/assets/c1b7683d-08af-408b-812d-7c9c8be76e16)

annotate is how we define entities in java, make sure to add annotated class.

entity is java obj representation from sql

book

![image](https://github.com/user-attachments/assets/5273acbd-d5a7-47d5-beaa-5f7cd703ef05)

isbn is good id candidate in real world so it can be annotated as ID
lazy means have to request it to do it
eager means it will do without request
notAll is a constraint
uniqueConstraints is a attribute of table

author

![image](https://github.com/user-attachments/assets/959347fe-e62c-423b-88f0-8009d2e6726a)

id: primary key
generatedValue: Serial key

annotatedClass(book.class) tells java which fields to expect for .e.g id, not null manyto one

Main

![image](https://github.com/user-attachments/assets/519e5b57-6558-47e1-8f0a-db63998eb87e)

![image](https://github.com/user-attachments/assets/93bb5cda-61ab-49e1-a150-270b34528b36)

![image](https://github.com/user-attachments/assets/2c0a36a2-198e-4c51-8555-ebfe1c530994)



instantiate obj in main and it will appear on the db table
doing lambda on session will automatically close sessions

![image](https://github.com/user-attachments/assets/56a110ee-3969-489e-9641-6cc44911adf4)

![image](https://github.com/user-attachments/assets/a5ec7a42-0ea7-44ba-8664-b821568e0be3)


![image](https://github.com/user-attachments/assets/1deeed77-b60f-4e6f-b01c-9412f328bac6)

![image](https://github.com/user-attachments/assets/607c70e8-b1ef-4dd8-b308-6ce0d8ba76d4)



