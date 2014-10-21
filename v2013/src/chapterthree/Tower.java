package chapterthree;

import java.util.Stack;

public class Tower {
	private int index;
	private Stack<Integer> disks;
	
	public Tower(int index){
		this.index=index;
		disks=new Stack<Integer>();
	}
	
	public void add(int d){
		if((!disks.isEmpty())&&disks.peek()<d)
			System.out.print("Error place disk "+d);
		else
			disks.push(d);
	}
	public int getIndex(){
		return index;
	}
	
	public void moveTopTo(Tower t){
		int top=disks.pop();
		t.add(top);
		System.out.println("Move disk "+top+" from Tower "+getIndex()+" to Tower "+t.getIndex());
	}
	public void print(){
		System.out.print("Content of Tower "+getIndex()+" is ");
		for(int i=disks.size()-1;i>=0;i--)
			System.out.print(disks.get(i)+" ");
	}
	
	public void moveDisks(int n, Tower destination, Tower buffer){
		if(n>0){
			moveDisks(n-1,buffer,destination);
			moveTopTo(destination);
			buffer.moveDisks(n-1,destination,this);
		}
	}
}
