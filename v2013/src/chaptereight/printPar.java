package chaptereight;

public class printPar {
	public static void main(String[] args){
		int n=2;
		char[] str=new char[n*2];
		listPar(n,n,str,0);
	}
	
	public static void listPar(int l, int r, char[] str, int index){
		if(l<0||r<0)
			return;
		if (l==0&&r==0){
			String strcopy=new String(str);
			System.out.print(strcopy+" ");}
		else {
			if(l>0)
		{	
			str[index]='(';
			listPar(--l,r,str,++index);
			
		}
		if(r>0)
		{
			str[index]=')';
			listPar(l,--r,str,++index);
		}
		}
	}
}
