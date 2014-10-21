package moderate;

import java.util.Hashtable;

public class SetupDictionary {
	public static void main(String[] args){
		String[] book={"a","ab","ab"};
		System.out.print(getFrequency(setupDic(book),"ab"));
		
	}
	public static Hashtable<String, Integer> setupDic(String[] book){
		Hashtable<String,Integer> table=new Hashtable<String,Integer>();
		for(int i=0;i<book.length;i++){
			String word=book[i].toLowerCase();
			if(word.trim()!=null){
				if(!table.containsKey(word))
					table.put(word,1);
				else{
					table.put(word, table.get(word)+1);
				}
			}
		}
		return table;
	}
	
	public static int getFrequency(Hashtable<String,Integer> table,String str){
		if(table==null||str==null)	return -1;
		if(table.containsKey(str))
			return table.get(str);
		return 0;
	}
}
