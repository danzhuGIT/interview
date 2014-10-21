package moderate;

public class MasterMind {
	public int hit;
	public int psedoHit;
	
	public void estimate(String solution, String guess){
		int solutionMark=0;
		
		for(int i=0;i<4;i++){
			solutionMark|=1<<(solution.charAt(i)-'A');
		}
		for(int i=0;i<4;i++){
			if(solution.charAt(i)==guess.charAt(i))
				hit++;
			else{
				if((solutionMark & (1<<(guess.charAt(i)-'A')))!=0)
					psedoHit++;					
			}
		}
	}
	
	public static void main(String[] args){
		MasterMind game=new MasterMind();
		game.estimate("RBGB", "GYGB");
		System.out.print("hit = "+game.hit+" psedoHit= "+game.psedoHit);
	}
}
