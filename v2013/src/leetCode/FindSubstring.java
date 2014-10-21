package leetCode;

import java.util.ArrayList;
import java.util.HashSet;

public class FindSubstring {
    public ArrayList<Integer> findSubstring(String S, String[] L) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> result=new ArrayList<Integer>();
        
        if(L==null||L.length==0)
            return result;
        
        HashSet<String> set=new HashSet<String>();
        
        for(int i=0;i<L.length;i++){
            set.add(L[i]);
        }
        
        int length=L[0].length();
        int totalLength=length*L.length;
        int start=0;
        while(start+totalLength<=S.length()){
            ArrayList<String> candidates=new ArrayList<String>();
            for(int i=start;i+length<=start+totalLength;i+=length){
                String word=S.substring(i,i+length);
                if(!set.contains(word)){
                    start++;
                    break;
                }   
                else{
                    candidates.add(word);
                }
            }
            if(candidates.size()!=L.length)
                continue;
            for(String l:L){
                if(candidates.contains(l))
                    candidates.remove(l);
            }
            if(candidates.isEmpty())
                result.add(start);
            start++;
            
        }
        return result;
            
    }
}
