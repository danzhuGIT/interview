package hard;

import java.util.ArrayList;

public class SuffixTreeMain {
	public static void main(String[] args){
		String[] stringList={"is","sip","hi","sis"};
		String testString="mississippi";
		SuffixTree tree=new SuffixTree(testString);
		for(String s:stringList){
			ArrayList<Integer> list=tree.getIndexes(s);
			if(list!=null)
				System.out.println(s+":"+list.toString());
			else
				System.out.println(s+":null");
		}
	}
}
