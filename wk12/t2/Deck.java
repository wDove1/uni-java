import java.util.concurrent.ThreadLocalRandom;
class Deck{
    private Card[] deck = new Card[7];

    public Deck(){
        deck[0]= new Card("Manchester Baby",72,0.001,0.125);
        deck[1]= new Card("TRADIC",66,1,0.062);
        deck[2]= new Card("Sinclair Spectrum",38,3.5,16);
        deck[3]= new Card("Commoder Amiga",33,7.09,512);
        deck[4]= new Card("iMac G3",33,7.09,524288);
        deck[5]= new Card("iPhone 1",13,620,131072);
        deck[6]= new Card("ThinkPad X1 Carbon",1,27405,16777216);
    }

    public void shuffle(){
        for (int i=0;i<10;i++){
            //int pos = Math.random()*deck.length;
            int pos = ThreadLocalRandom.current().nextInt(0,deck.length);
            swap(pos);

        }
    }

    private void swap(int pos){
        Card temp=deck[0];
        deck[0]=deck[pos];
        deck[pos]=temp;

    }

    public void deal(Player[] players){

        int cCount=7/players.length;
        for (int i=0;i<players.length;i++){
            for (int n=0;n<cCount;n++){
                players[i].addCard(deck[n]);
            }
        }
    }
}