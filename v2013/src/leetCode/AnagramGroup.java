package leetCode;

import java.util.ArrayList;
import java.util.HashMap;


public class AnagramGroup {
	public static void main(String[] args){
		String[] strs={"abc","bac","ddb","asgas","bdg","apple","pplea","sd",};
		System.out.print(anagramGroup(strs));
	}
	
	public static ArrayList<String> anagramGroup(String[] strs){
		HashMap<String,HashMap<Character, Integer>> strMap=new HashMap<String, HashMap<Character, Integer>>();
		HashMap<HashMap<Character, Integer>,Integer> freq=new HashMap<HashMap<Character, Integer>,Integer>();
		for(String str:strs){
			HashMap<Character, Integer> map=new HashMap<Character, Integer>();
			for(int i=0;i<str.length();i++){
				char c=str.charAt(i);
				map.put(c,map.get(c)==null? 1:map.get(c)+1);
			}
			strMap.put(str, map);
			freq.put(map,freq.get(map)==null? 1:freq.get(map)+1);
				
		}
		ArrayList<String> result=new ArrayList<String>();
		for(String str:strs){
			if(freq.get(strMap.get(str))>1)
				result.add(str);
		}
		return result;
	}
}
