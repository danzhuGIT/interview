
public class Card {
	public enum Suit {
		CLUBS(1),SPADES(2),HEARTS(3),DIAMONDS(4);
		int value;
		private Suit(int v){
			value=v;
		}
		public int getValue(){
			return value;
		}
	}
	private int card;
	private Suit suit;
	
	public Card(int d, Suit s){
		card=d;
		suit=s;
	}
	public Suit getSuit(){
		return suit;
	}
	public int getValue(){
		return card;
	}
	
	public static void main(String[] args){
		Suit s=Suit.CLUBS;
		Card c=new Card(3,s);
		System.out.print(c.getSuit().getValue());
	}
}
