class Game{
    private Player[] players= new Player[2];
    
    public Game(String pName1,String pName2){
        players[0]= new Player(pName1);
        players[1]= new Player(pName2);
    }

    public void play() {
        
        Deck deck=new Deck();
        deck.shuffle();
        deck.deal(players);
        players[0].peek().display();
        //int currentPlayer=0;
        //while(!players[currrentPlayer].hasWon()){
        //    players[currentPlayer].play();
        //}


    }

    //public void addPlayer(String pPlayer){
    //    players.add(pPlayer);
    //}

    public String winner(Result[] results){
        double highest=0;
        for (int i=0;i<results.length;i++){
        
        }
    }
    
}