package chapterthree;

public class StackOne {
	private int stackSize;
	private int[] buffer;
	private int[] pointer={0,0,0};
	
	public StackOne(int size)
	{
		stackSize=size;
		buffer=new int[stackSize*3];
	}
	
	void push(int stackNum, int data)
	{
		int index=stackNum*stackSize+pointer[stackNum];
		if(pointer[stackNum]==stackSize)
			System.out.println("Buffer is full.");
		else
		{
			buffer[index]=data;	
			pointer[stackNum]++;
		}		
	}
	
	int pop(int stackNum){
		int index=stackNum*stackSize+pointer[stackNum];
		int popData;
		
		popData=buffer[index-1];
		pointer[stackNum]--;

		return popData;
	}
	
	int peek(int stackNum){
		int index=stackNum*stackSize+pointer[stackNum];
		int peekData;
		
		peekData=buffer[index-1];

		return peekData; 
	}
	
	boolean isEmpty(int stackNum){	
		return pointer[stackNum]==0;
	}

}
