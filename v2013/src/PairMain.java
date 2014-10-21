
public class PairMain {
	public static void main(String[] args){
		String[] names={ "Tom", "Diana", "Harry" };
		Pair<String,Integer> result= firstContain(names,"a");
		System.out.println(result.getFirst());
		System.out.println("Expected: Diana");
		System.out.println(result.getSecond());
		System.out.println("Expected: 1");
		Pair2 result2=new Pair2("Diana",1);
		Pair2 result3=new Pair2("Di","asd");
		System.out.println(result2.getFirst());
	}
	
	public static Pair<String,Integer> firstContain(String[] strings, String sub)
	{
		for(int i=0;i<strings.length;i++){
			if(strings[i].contains(sub))
				return new Pair<String,Integer>(strings[i],i);
		}
		return new Pair<String,Integer>(null,-1);
	}
}
