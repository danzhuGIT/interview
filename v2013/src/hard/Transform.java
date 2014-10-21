package hard;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Transform {
	public LinkedList<String> transform(String startWord, String endWord, Set<String> dictionary){
		startWord=startWord.toUpperCase();
		endWord=endWord.toUpperCase();
		Queue<String> actionQueue=new LinkedList<String>();
		Set<String> visitedSet=new HashSet<String>();
		Map<String,String> backTrackMap=new HashMap<String,String>();
		
		actionQueue.offer(startWord);
		visitedSet.add(startWord);
		while(!actionQueue.isEmpty()){
			String cur=actionQueue.poll();
			for(String next:getOneEditStep(cur)){
				if(next.equals(endWord)){
					LinkedList<String> list=new LinkedList<String>();
					list.add(next);			
					while(cur!=null){
						list.add(0,cur);
						cur=backTrackMap.get(cur);
					}
					return list;
				}
				if(dictionary.contains(next)){
					if(!visitedSet.contains(next)){
						actionQueue.offer(next);
						visitedSet.add(next);
						backTrackMap.put(next,cur);
					}
				}
			}
		}
		return null;
	}
	
	public Set<String> getOneEditStep(String cur){
		Set<String> result=new HashSet<String>();
		for(int i=0;i<cur.length();i++){
			char[] words=cur.toCharArray();
			for(char c='A';c<='Z';c++){
				words[i]=c;
				result.add(new String(words));
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		Transform t=new Transform();
		Set<String> dictionary=new HashSet<String>();
		dictionary.add("DAMP");
		dictionary.add("LAMP");
		dictionary.add("LIMP");
		dictionary.add("LIME");
		dictionary.add("LIKE");
		dictionary.add("AKPM");
		dictionary.add("DAME");
		dictionary.add("CAMP");
		dictionary.add("CBMP");
		dictionary.add("CBKP");
		dictionary.add("CIKP");
		dictionary.add("CIKE");
		LinkedList<String> list=t.transform("DAMP", "LIKE", dictionary);

		if(list!=null){
			for(int i=0;i<list.size();i++)
				System.out.print(list.get(i)+" ");
		}
	}
}
