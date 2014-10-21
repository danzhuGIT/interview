package secondbook;

import java.util.ArrayList;

public class Combine {
	public static void main(String[] args){
		String str="wxyz";
		System.out.print(doCombine(str));
		
	}
	
	public static ArrayList<String> doCombine(String str){
		ArrayList<String> list=new ArrayList<String>();
		if(str.length()==0)
			return null;
		if(str.length()>1){			
			ArrayList<String> remain=doCombine(str.substring(1));		
			int length=remain.size();
			for(int i=0;i<length;i++){
				list.add(remain.get(i));
				list.add(remain.get(i)+str.substring(0,1));
			}
		}
		list.add(str.substring(0,1));
		return list;
	}
}
