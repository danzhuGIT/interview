package leetCode;

import java.util.ArrayList;

public class ParenthesesGenerate {
	public ArrayList<String> generateParenthesis(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<String> result=new ArrayList<String>();
        recursion(0,n,0,0,"",result);
        return result;
        
    }
    
    public void recursion(int nPair, int n, int leftOpen, int leftTotal, String s, ArrayList<String> result){
        if(nPair==n){
            result.add(s);
            return;
        }
        if(leftTotal>n)
            return;
        
        recursion(nPair,n,leftOpen+1,leftTotal+1,s+"(",result);
        while(leftOpen>0)
            recursion(nPair+1,n,--leftOpen,leftTotal,s+")",result);
            
    }
}
