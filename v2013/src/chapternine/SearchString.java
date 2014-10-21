package chapternine;

public class SearchString {
	public static void main(String[] args){
		String[] strings={"at","","","ball","car","","","","dad","",""};
		System.out.print(searchString(strings,"ballball"));
	}
	
	public static int searchString(String[] strings, String str){
		if(strings.length==0)
			return -1;
		if(str==""){
			for(int i=0;i<strings.length;i++)
				if(strings[i]=="")
					return i;
		}
		return search(strings, str);
	}
	public static int search(String[] strings, String str){
		int start=0;
		int end=strings.length-1;
		while(start<=end){
			while(start<=end&&strings[end]=="")
				end--;
			if(start>end)
				return -1;
			
			int mid=(start+end)/2;
			while(strings[mid]=="")
				mid++;
			int k=str.compareTo(strings[mid]);
			if(k==0)	return mid;
			if(k<0)		
				end=mid-1;
			else 
				start=mid+1;			
		}
		return -1;
	}
}
