package leetCode;

import java.util.HashMap;

public class NumToRoman {
	public static void main(String[] args){
		System.out.println(numToRoman(215));
		System.out.println(romanToNum("CCXV"));
	}
	
	public static String numToRoman(int n){
		String result="";
		int[] base={1000,900,500,400,100,90,50,40,10,9,5,4,1};
		HashMap<Integer,String> baseMap=new HashMap<Integer,String>();
		baseMap.put(1000, "M");
		baseMap.put(900, "CM");
		baseMap.put(500, "D");
		baseMap.put(400, "CD");
		baseMap.put(100, "C");
		baseMap.put(90, "XC");
		baseMap.put(50, "L");
		baseMap.put(40, "XL");
		baseMap.put(10, "X");
		baseMap.put(9, "IX");
		baseMap.put(5, "V");
		baseMap.put(4, "IV");
		baseMap.put(1, "I");
		
		for(int i:base){
			while(n>=i){
				result+=baseMap.get(i);
				n-=i;
			}
		}
		return result;
	}
	
	public static int romanToNum(String roman){
		HashMap<String, Integer> baseMap=new HashMap<String, Integer>();
		baseMap.put("M",1000);
		baseMap.put("CM",900);
		baseMap.put("D",500);
		baseMap.put("CD",400);
		baseMap.put("C",100);
		baseMap.put("XC",90);
		baseMap.put("L",50);
		baseMap.put("XL",40);
		baseMap.put("X",10);
		baseMap.put("IX",9);
		baseMap.put("V",5);
		baseMap.put("IV",4);
		baseMap.put("I",1);
		
		int i=0;
		int num=0;
		while(i<roman.length()){
			if(i+1<roman.length()){
				String tmp=roman.substring(i,i+2);
				if(baseMap.containsKey(tmp)){
					num+=baseMap.get(tmp);
					i+=2;
					continue;
				}
			}
			
			String tmp=roman.substring(i,i+1);
			num+=baseMap.get(tmp);
			i+=1;
			
		}
		return num;
	}
}
