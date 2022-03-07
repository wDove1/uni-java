public class Result{

	private Card card;
	private String stat;
	private String player;

	public Result(Card pCard,String pStat,String pPlayer){
		card=pCard;
		stat=pStat;

	}

	public Card getCard(){
		return card;
	}

	public String getStat(){
		return stat;
	}
}