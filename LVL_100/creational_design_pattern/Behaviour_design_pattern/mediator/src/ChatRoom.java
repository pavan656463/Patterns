package Behaviour_design_pattern.mediator.src;

import java.util.*;

// Concrete mediator class
class ChatRoom implements ChatMediator {
    private Map<String, User> users = new HashMap<>();
    private Map<User, List<User>> privateChats = new HashMap<>();
    public String Name ;

    ChatRoom(String name){
        this.Name   = name ; 
    }
    @Override
    public void sendMessage(User sender, String message, boolean isBroadcast) {
        if (isBroadcast) {
            for (User user : users.values()) {
                if (user != sender) {
                    user.receiveMessage(sender, message);
                }
            }
        } else {
            System.out.println(new Date().toString() + " [" + sender.getName() + "] : " + message);
        }
    }

    @Override
    public void sendPrivateMessage(User sender, User receiver, String message) {
        List<User> participants = privateChats.getOrDefault(sender, new ArrayList<>());
        if (!participants.contains(receiver)) {
            participants.add(receiver);
            privateChats.put(sender, participants);
        }
        receiver.receivePrivateMessage(sender, message);
    }

    public void addUser(User user) {
        users.put(user.getName(), user);
    }

    public User getUser(String name) {
        return users.get(name);
    }

    public String getChatRoomName(){
        return Name ; 
    }


}
