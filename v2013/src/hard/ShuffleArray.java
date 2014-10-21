package hard;

public class ShuffleArray {
	public static void main(String[] args){
		int[] cards={1,2,3,4,5};
		shuffleArray(cards);
	}
	public static void shuffleArray(int[] cards){
		int tmp, index;
		for(int i=0;i<cards.length;i++){
			index=i+(int)(Math.random()*(cards.length-i));
			tmp=cards[index];
			cards[index]=cards[i];
			cards[i]=tmp;
			System.out.print(cards[i]);
		}
		
	}
}
