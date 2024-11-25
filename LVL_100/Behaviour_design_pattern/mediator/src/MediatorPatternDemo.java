package Behaviour_design_pattern.mediator.src;

/*
Mediator pattern is used to reduce communication complexity between multiple objects or classes. 
This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling. 
Mediator pattern falls under behavioral pattern category.
 * Implementation
We are demonstrating mediator pattern by example of a chat room where multiple users can send message to chat room and it is the responsibility of chat room to show the messages to all users. 
We have created two classes ChatRoom and User. User objects will use ChatRoom method to share their messages.

MediatorPatternDemo, our demo class, will use User objects to show communication between them.
*/
public class MediatorPatternDemo {
   public static void main(String[] args) {
       ChatMediator C1 = new ChatRoom("Tech official");

       // Adding 10 users to the chat room
       for (int i = 1; i <= 10; i++) {
           User user = new User("User" + i, C1);
           ((ChatRoom) C1).addUser(user);
       }

       User user1 = ((ChatRoom) C1).getUser("User1");
       User user2 = ((ChatRoom) C1).getUser("User2");
       User user3 = ((ChatRoom) C1).getUser("User3");

       // Sending broadcast message
       user1.sendMessage("Broadcast message from User1", true);

       // Sending private messages
       user1.sendPrivateMessage(user2, "Private message from User1 to User2");
       user2.sendPrivateMessage(user1, "Private message from User2 to User1");

       // Sending private messages to non-existing users
       user1.sendPrivateMessage(user3, "Trying to send message to User3 (not in the chat room)");
        
   }
}
