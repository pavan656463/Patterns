package Behaviour_design_pattern.mediator.src;

import java.util.*;

// Mediator interface
interface ChatMediator {
    void sendMessage(User sender, String message, boolean isBroadcast);
    void sendPrivateMessage(User sender, User receiver, String message);
}

