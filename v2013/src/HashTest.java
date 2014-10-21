import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class HashTest {
	public static void main(String[] args){
		HashSet<String> names=new HashSet<String>();
		names.add("Dan");
		names.add("Zhu");
		if (names.contains("Dan"))
			names.add("DanZhu");
		//Iterator<String> iter=names.iterator();
		for(String name:names)
		{
			System.out.println(" "+name);
		}
		
		Map<String,Integer> age=new HashMap<String,Integer>();
		age.put("Dan Zhu",24);
		age.put("Yong Yang",25);
		age.put("Yunjie Zhu", 52);
		age.remove("Yunjie Zhu");
		Set<String> keySet=age.keySet();
		for(String key:keySet){
			int ageValue=age.get(key);
			System.out.println(key+" "+ageValue);
		}
		
	}
}
