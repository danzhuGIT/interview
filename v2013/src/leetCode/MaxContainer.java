package leetCode;

public class MaxContainer {
	public static void main(String[] args){
		int[] h={1,4,4,6};
		System.out.print(maxContainer(h));
	}
	
	public static int maxContainer(int[] height){
		int i=0;
		int j=height.length-1;
		int best=0;
		while(i<j){
			int area=Math.min(height[i],height[j])*(j-i);
			if(area>best)
				best=area;
			if(height[i]<height[j])
				i++;
			else
				j--;
				
		}
		
		return best;
	}
}
