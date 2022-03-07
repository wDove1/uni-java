import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//import javafx.util.Pair;

class Player{
    private String name;
    private Queue<Card> cards = new LinkedList<>();

    Scanner input=new Scanner(System.in);

    public Player(String pName){
        name=pName;
    }

    public String getName(){
        return name;
    }


    public void addCard(Card pCard){
        cards.add(pCard);
    }


    public Card getCard(){
        return cards.remove();
    }


    public Card peek(){
        return cards.peek();
    }


    public int sizeOfHand(){
        return cards.size();
    }

    public Result playTurn(){
        cards.peek().display();
        System.out.println("Please enter the stat to play on: ");
        String stat=input.nextLine();
        return new Result(cards.remove(),stat);
    }


}