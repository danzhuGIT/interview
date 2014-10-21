package moderate;

public class ShortestDistance {
	public static void main(String[] args){
		String[] words={};
		
	}
	
	public static int shortestDistance(String[] words, String word1, String word2){
		int pos1=Integer.MIN_VALUE;
		int pos2=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int dis=0;
		for(int i=0;i<words.length;i++){
			if(words[i].equals(word1)){
				pos1=i;
				dis=pos1-pos2;
				if(min>dis)
					min=dis;
			}
			if(words[i].equals(word2)){
				pos2=i;
				dis=pos2-pos1;
				if(min>dis)
					min=dis;
			}
		}
		return min;
	}
}
