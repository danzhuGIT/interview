package hard;

import java.util.ArrayList;
import java.util.HashMap;

public class SuffixTreeNode {
	char value;
	HashMap<Character, SuffixTreeNode> children=new HashMap<Character,SuffixTreeNode>();
	ArrayList<Integer> indexes=new ArrayList<Integer>();
	
	public SuffixTreeNode(){}
	
	public void insertString(String s, int index){
		indexes.add(index);
		SuffixTreeNode child=null;
		if(s!=null&&s.length()>0){
			value=s.charAt(0);
			if(!children.containsKey(value)){
				child=new SuffixTreeNode();
				children.put(value, child);
			}
			else{
				child=children.get(value);
			}
			child.insertString(s.substring(1), index);
		}
	}
	
	public ArrayList<Integer> getIndexes(String s){
		if(s==null||s.length()==0)
			return indexes;
		else{
			char first=s.charAt(0);
			if(children.containsKey(first))
				return children.get(first).getIndexes(s.substring(1));
		}
		return null;
	}
}
