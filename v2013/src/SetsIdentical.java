import java.util.HashSet;


public class SetsIdentical {
	public static void main(String[] args){
		String[][] sets={{"a","b"},{"b","b","a"},{"b","a"}};
		String[][] sets2={{"a","b"},{"a"},{"b"}};
		String[][] sets3={{"a","b"},{""},{"b"}};

		System.out.println(allStringSetsIdentical(sets));
		System.out.println(allStringSetsIdentical(sets2));
		System.out.println(allStringSetsIdentical(sets3));

	}
	
	public static boolean allStringSetsIdentical(String[ ][ ] sets){
		HashSet<String> elements=new HashSet<String>();
		for(int j=0;j<sets[0].length;j++){
			elements.add(sets[0][j]);	
		}
		for(int i=1;i<sets.length;i++){
			HashSet<String> elementsith=new HashSet<String>();
			for(int j=0;j<sets[i].length;j++){
				if(!elements.contains(sets[i][j]))
					return false;
				else
					elementsith.add(sets[i][j]);
			}
			if(elementsith.size()!=elements.size())
				return false;
		}
		return true;
	}
}
