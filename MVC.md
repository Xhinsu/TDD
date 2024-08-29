Server: 
Just a computer/device 
Is a program listening for requests
Listen on a specific port, comes usually in 4 digit, comes after the host url

Can change port number
application.properties
server-port

Springboot allows us to make server easily
Monolithc architecture: A single tiered software application UI, database and business logic all contained in the same platform
Exists on a spectrum: Most extreme, everything in one giant file/method

Business logic: The business logic are the set of codes in your application that handles communication between an end user interface and a database
What isnt business logic: UI, DB,settings, Parsings HTTP reqs

Keeping separate layers can help test for things better.

Layered
Views: Presentation tier
Services tier
Database tier

![image](https://github.com/user-attachments/assets/3c56d0e4-f6a7-461d-979f-900de02ad1b0)


MVC

![image](https://github.com/user-attachments/assets/a86b87c1-4c1b-4deb-89fd-1b1e49e66609)
![image](https://github.com/user-attachments/assets/52b0d639-1e46-4411-8879-e3fb159c3bf5)


Views interacts
Controller: 
  Deals with http request. View between view and backend services.  Looks at req obj and pass data to business layer and appropriate response is sent back along with status and body.
  The Controller layer is the part that is in charge of routing and deciding what actions to perform next. It is the bridge between the View/Presentation Layer and the Backend services

Model/ repository layer: working with the database and the logic layer
MSRC: model, services, repository and controllers are the separate layers.
services: business logic/handles data transformation
repository: database access/query handling and returning data in forms of obj to service layer
controller: http requests

controller call service layer, then to repository layer ->connect to DB -> get result mapped it to JAVA obj->and its being returned.

PizzaController

![image](https://github.com/user-attachments/assets/c16c239c-d50d-41b2-8420-8042d81a0b0b)

PlanetsController

![image](https://github.com/user-attachments/assets/ff15d3f4-d47e-4aca-82b8-9f53319b6f8b)
![image](https://github.com/user-attachments/assets/c92432b4-1796-4d96-9853-142d1f9d03da)
![image](https://github.com/user-attachments/assets/f525a468-e2b7-4051-9f47-180a7f6c7334)

Planet model

![image](https://github.com/user-attachments/assets/959796a7-cabe-4cb6-95a0-5f805f403340)

Repository

![image](https://github.com/user-attachments/assets/aeffc911-279a-49b8-8085-e18f64635ba3)

![image](https://github.com/user-attachments/assets/d834f59e-e07f-4830-bcfb-1f9b9bdd13d0)
![image](https://github.com/user-attachments/assets/875fd736-b6f8-4180-a8e6-f9ae78988499)
![image](https://github.com/user-attachments/assets/a2a31fc2-7b46-4c15-91ac-a495427ac36d)




Service layer

![image](https://github.com/user-attachments/assets/675bf58c-c4b2-4fbd-a537-4bb61c2fe848)

![image](https://github.com/user-attachments/assets/a5eef5d9-16ee-4ca1-98aa-73cbc247b0e6)


![image](https://github.com/user-attachments/assets/71b06788-014a-43d5-9385-5e7fb62ecc50)

get req to see all pokemon from View
service layer invokes method getAllPokemon()
get req to a pokemon


app.properties

![image](https://github.com/user-attachments/assets/6fc53306-2add-4f0d-b9c5-797be25641e4)

Exception

![image](https://github.com/user-attachments/assets/4b57579e-38c0-4f00-ac8c-34e7d805bd2d)











