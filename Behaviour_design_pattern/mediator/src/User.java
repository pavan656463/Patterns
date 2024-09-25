package Behaviour_design_pattern.mediator.src;

import java.util.Date;

public class User {
    private String name;
    private ChatMediator mediator;

    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message, boolean isBroadcast) {
        mediator.sendMessage(this, message, isBroadcast);
    }

    public void sendPrivateMessage(User receiver, String message) {
        mediator.sendPrivateMessage(this, receiver, message);
    }

    public void receiveMessage(User sender, String message) {
        System.out.println(new Date().toString() + " [" + sender.getName() + " -> " + name + "] : " + message);
    }

    public void receivePrivateMessage(User sender, String message) {
        System.out.println(new Date().toString() + " [" + sender.getName() + " -> " + name + " (Private)] : " + message);
    }
}
