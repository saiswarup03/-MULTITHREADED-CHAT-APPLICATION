# -MULTITHREADED-CHAT-APPLICATION

*COMPANY*:CODTECH IT SOLUTIONS

*NAME*:K N VENKATA SAI SWARUP

*INTERN ID*:CT04DG3076

*DOMAIN*:JAVA PROGRAMMING

*DURATION*:4 WEEKS

*MENTOR*:NEELA SANTOSH

A **multithreaded chat application** is a real-time communication system that allows multiple users to exchange messages simultaneously. It follows a **client-server architecture**, where the **server** manages message routing and each **client** connects to it to send and receive messages. The key feature of this application is the use of **multithreading** to handle multiple client connections concurrently without blocking operations.

The **server** runs continuously and listens for incoming client connections using sockets. For every new client that connects, the server spawns a **new thread** dedicated to managing that client's communication. This design allows multiple clients to interact with the server at the same time, ensuring real-time responsiveness and seamless message delivery.

Each **client** also uses threads—typically one for sending messages and another for receiving them—so users can type and view messages simultaneously without delay. Messages sent by any client are received by the server and then broadcast to all other connected clients.

This type of application demonstrates key networking and concurrency concepts in Java, such as `ServerSocket`, `Socket`, and the `Thread` class. It is ideal for learning how to build scalable networked systems that manage parallel tasks.

Overall, a multithreaded chat application is a robust and interactive platform that highlights the power of Java multithreading in managing real-time communication between multiple users efficiently.

*OUTPUT*:
Connected to chat server.
Enter your name: Alice
Bob: Hi everyone!
Charlie: Hello Bob!
Alice: Hey Bob and Charlie!
Charlie: Welcome Alice!
