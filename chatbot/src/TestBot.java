import java.util.*;
public class TestBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String youInput = "";
        MyBot chatbot = new MyBot();
        while(!youInput.equalsIgnoreCase("stop it")) {
            System.out.print("You: ");
            youInput = sc.nextLine();
            chatbot.answer(youInput);
        }
        sc.close();
    }
}