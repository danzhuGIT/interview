package hard;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class MaintainMedian {
	public PriorityQueue<Integer> maxHeap;
	public PriorityQueue<Integer> minHeap;
	
	public MaintainMedian(){
		maxHeap=new PriorityQueue<Integer>(10,Collections.reverseOrder());
		minHeap=new PriorityQueue<Integer>();
	}
	
	public void addNewNumber(int newNum){
		if (maxHeap.size()==minHeap.size()){
			if(minHeap.peek()!=null&&minHeap.peek()<newNum){
				maxHeap.offer(minHeap.poll());
				minHeap.offer(newNum);
			}
			else
				maxHeap.offer(newNum);
			
		}
		else{
			if(maxHeap.peek()>newNum){
				minHeap.offer(maxHeap.poll());
				maxHeap.offer(newNum);
			}
			else
				minHeap.offer(newNum);
		}			
	}
	
	public double getMedian(){
		if(minHeap.isEmpty()) return maxHeap.peek();
		if(maxHeap.isEmpty()) return minHeap.peek();
		if(maxHeap.size()==minHeap.size())
			return (maxHeap.peek()+minHeap.peek())/2;
		else if(maxHeap.size()>minHeap.size())
			return maxHeap.peek();
		else
			return minHeap.peek();
	}
	
	public static void main(String[] args){
		MaintainMedian m=new MaintainMedian();
		Random rand=new Random(47);
		int newNum=rand.nextInt(10);
		for(int i=0;i<5;i++){
			newNum=rand.nextInt(20);
			System.out.print(newNum+" ");
			m.addNewNumber(newNum);
			System.out.print(m.getMedian()+" ");			
		}
	}
}
