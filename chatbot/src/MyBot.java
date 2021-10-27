import java.util.*;
public class MyBot {
    HashMap<String, String> knowledge = new HashMap<String, String>();
    private String question;
    private String question2;
    private Scanner sc;

    public MyBot() {
        knowledge.put("Hi", "Hello... how am i help you!");
        knowledge.put("Hello", "Hi yo");
        knowledge.put("how are you?", "Great! And you?");
        knowledge.put("what time is it", "Look at your watch!");
        knowledge.put("sathish", "creator of this app");
        knowledge.put("mathan", "creator of this app");
        knowledge.put("ahmad", "creator of this app");
        knowledge.put("", "");  // to add knowledge to this bot
        knowledge.put("", "");
        knowledge.put("", "");
    }
    
    public void answer(String question) {
        Set<String> keys = knowledge.keySet();
        for (String key : keys){
            String lowerKey = key.toLowerCase();
            String lowerQuestion = question.toLowerCase();
            if (lowerKey.contains(lowerQuestion)) {
               System.out.println("Bot: " + knowledge.get(key));
               return;//break
            }
           
        }
        trainMe(question);
        
    }
    public void trainMe(String question) {
        System.out.println("Bot: Sorry, Im dumb! How should I reply");
        System.out.print("User suggestion: ");
        sc = new Scanner(System.in);
        String youInput = sc.nextLine();
        knowledge.put(question, youInput);

        
    }
   
 }