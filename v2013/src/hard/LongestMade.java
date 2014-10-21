package hard;

import java.util.Arrays;
import java.util.HashSet;

public class LongestMade {
	public static void main(String[] args){
		String[] strings={"testing","test","testinging","ing","testin","te","ting"};
		System.out.print(longestMade2(strings));
	}

	public static String longestMade(String[] strings){
		String result=null;
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<strings.length;i++){
			set.add(strings[i]);
		}
		Arrays.sort(strings,new LengthComparator());
		for(int i=0;i<strings.length;i++){
			for(int j=1;j<strings[i].length();j++){
				if(set.contains(strings[i].substring(0,j))&&set.contains(strings[i].substring(j))){
					result=strings[i];
					break;
				}
			}
			if (result!=null)
				break;
		}
		return result;
	}
	
	public static String longestMade2(String[] strings){
		String result=null;
		String[] stringsCopy=Arrays.copyOf(strings, strings.length);
		Arrays.sort(stringsCopy);
		Arrays.sort(strings,new LengthComparator());
		for(int i=0;i<strings.length;i++){
			for(int j=1;j<strings[i].length();j++){
				if(Arrays.binarySearch(stringsCopy, strings[i].substring(0,j))>=0
					&&Arrays.binarySearch(stringsCopy, strings[i].substring(j))>=0){
					result=strings[i];
					break;
				}
			}
			if (result!=null)
				break;
		}
		return result;
	}
	
}
