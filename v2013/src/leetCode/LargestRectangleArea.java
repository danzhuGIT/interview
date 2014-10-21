package leetCode;

import java.util.Stack;

public class LargestRectangleArea {
	public static void main(String[] args){
		int[] heights={1,3,5,7,4};
		int[] heights2={2,1,5,6,2,3};

		System.out.println(largestRectangleArea(heights));
		System.out.println(largestRectangleArea(heights2));

	}
	
	public static int largestRectangleArea(int[] heights){
		int max=0;
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<heights.length;i++){
			if(stack.isEmpty()||heights[i]>=stack.peek())
				stack.push(heights[i]);
			else {
				int count=0;
				while(!stack.isEmpty()&&stack.peek()>heights[i]){
					count++;
					max=Math.max(max,stack.pop()*count);
				}
				while(count>=0){
					stack.push(heights[i]);
					--count;
				}
			}			
		}
		
		int count=0;
		while(!stack.isEmpty()){
			count++;
			max=Math.max(max,stack.pop()*count);
		}
		return max;
	}
}
