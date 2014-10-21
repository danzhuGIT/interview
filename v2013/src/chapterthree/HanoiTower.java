package chapterthree;

public class HanoiTower {
	public static void main(String[] args){
		Tower[] towers=new Tower[3];
		int n=3;//number of disks
		for(int i=0;i<3;i++){
			towers[i]=new Tower(i);
		}
		for(int i=n;i>0;i--){
			towers[0].add(i);
		}
		towers[0].moveDisks(n,towers[2],towers[1]);
		towers[2].print();
		
	}
}
