package Behaviour_design_pattern.mediator;

import java.util.Date;

public class ChatRoom {
   public static void showMessage(User sender, String message){
      System.out.println(new Date().toString() + " [" + sender.getName() + "] : " + message);
   }
}
