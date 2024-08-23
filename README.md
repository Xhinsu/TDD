# Notes

Sessions: Stores work and at end transfers to DB. It is confined to single unit of work
grouping of queries/ transactions in one session instead of sending update, insert, select one at a time.

Step 1: start session
Step 2: Do work
Step 3: Flush it

Hibernate revolves around session factory
Create StandardServiceRegistry registry to align our hibernate settings and build it.
![image](https://github.com/user-attachments/assets/a97772d5-302b-4c9b-8677-2a2f2ee2ebc4)
