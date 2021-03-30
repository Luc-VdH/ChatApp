import java.util.ArrayList;
import java.util.Scanner;

public class Chat{
    private String user1, user2;
    
    private ArrayList<ChatMessage> messages;
    
    public Chat(String u1, String u2){
        user1 = u1;
        user2 = u2;
        messages = new ArrayList<ChatMessage>();
    }
    
    public void initChat(Scanner scan){
        while(scan.hasNext()){
            messages.add(new ChatMessage(scan.nextLine()));
        }
    }
    
    public void addMessage(String line){
        messages.add(new ChatMessage(line));
    }
    public boolean equals(Object other){
		Chat otherChat = (Chat)other;
		if(otherChat != null && otherChat instanceof Chat && otherChat.getUser1().equals(this.user1) && otherChat.getUser2().equals(this.user2)){
			return true;
		}else{
			return false;
		}
    }
    public String toString(){
        String out = "";
        for(ChatMessage i : messages) out += i +"\n";
        return out;
    }
    public String getUser1(){
	return user1;
    }
    public String getUser2(){
	return user2;
    }
}	
