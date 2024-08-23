# Notes

Sessions: Stores work and at end transfers to DB. It is confined to single unit of work
grouping of queries/ transactions in one session instead of sending update, insert, select one at a time.

Step 1: start session
Step 2: Do work
Step 3: Flush it

Hibernate revolves around session factory
Create StandardServiceRegistry registry to align our hibernate settings and build it.
![image](https://github.com/user-attachments/assets/a97772d5-302b-4c9b-8677-2a2f2ee2ebc4)
annotate is how we define entities in java

entity is java obj representation from sql
book
![image](https://github.com/user-attachments/assets/496b0b76-6938-440f-ac0e-4967bd83d960)
isbn is good id candidate in real world so it can be annotated as ID

author
![image](https://github.com/user-attachments/assets/959347fe-e62c-423b-88f0-8009d2e6726a)
id: primary key
generatedValue: Serial key
