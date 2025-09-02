package chatroom;

import java.util.List;
import java.util.ArrayList;


public class ChatController {
    
    private List<ChatWindow> chatWindowArrayList = new ArrayList<>();
    
    public static void main(String[] args) {
        new AddChatParticipant().setVisible(true);
    }
    
    public void addParticipant(String name) {
        chatWindowArrayList.add(new ChatWindow(name, this));
        showNewParticipant();
    }

    public void recieveMessage(String name, String message) {
        for (ChatWindow chatWindow : chatWindowArrayList) {
            chatWindow.displayMessage(name, message);
        }
    }
    
    public void showNewParticipant() {
        chatWindowArrayList.get(chatWindowArrayList.size() - 1).setVisible(true);
    }
}
