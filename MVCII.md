Test

![image](https://github.com/user-attachments/assets/22dca65e-52b5-4b55-9a2b-37a28750ec5b)

![image](https://github.com/user-attachments/assets/5ba1d71e-5fe1-48c8-83f2-2e60c73d518a)

![image](https://github.com/user-attachments/assets/0baee730-fe6b-4682-8519-3833ce50214d)

![image](https://github.com/user-attachments/assets/ba462b91-3f08-4eee-adac-ba0c4253db2f)


Autowired
Controller class are there for communicatoin not for instantiating classes.
Service object (a dependency) has its own state and can be enormous task with contextual data, so controller class shouldn't instantiate.

![image](https://github.com/user-attachments/assets/1f390e31-72b6-4a3f-aa2a-619e050e3cb6)
![image](https://github.com/user-attachments/assets/9d399391-9b62-469a-9ae0-7ec8952a7960)

![image](https://github.com/user-attachments/assets/9ae563f8-fd3a-4f43-a3c6-9da6030f944e)
we injected coffeeService into coffeeController in the main class/ from outside using constructor. Instead of the coffee controller instantiating itself.
We can also use setter method to inject dependency instead of constructor.

Autowiring is spring way of doing above in a simple way. Beans are simply simpleton objectors. Each class has one bean.
autowire handles dependency inj for us.
Services are singleton instance

![image](https://github.com/user-attachments/assets/5c1511a4-afa0-44c0-ba71-40275f4d6999)

![image](https://github.com/user-attachments/assets/c34a29b7-90a6-465c-a7bc-b6e8ab77103c)

![image](https://github.com/user-attachments/assets/fbc732b2-b335-452c-b78a-caf8017b3d75)

It will inject the singleton instance wherever it needs, it has same state that its configured


Nested enum

![image](https://github.com/user-attachments/assets/ec51fe85-ca5b-4ba5-9242-480a1db25ef3)


