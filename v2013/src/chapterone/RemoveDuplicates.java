package chapterone;

public class RemoveDuplicates {
	public static void main(String[] args){
		String s="asgasd";
		char[] str=s.toCharArray();
		int tail=1;
		if(str.length>1){
			for(int i=1;i<str.length;i++){
				int j;
				for(j=0;j<tail;j++)
					if(str[i]==str[j])
						break;
				if(j==tail){
					str[tail]=str[i];
					tail++;					
				}
			}
			str[tail]=0;
		}
		while(tail<str.length){
			str[tail++]=0;
		}
		System.out.print(str);
	}
}
