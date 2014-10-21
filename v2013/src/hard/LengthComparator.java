package hard;

import java.util.Comparator;

public class LengthComparator implements Comparator<String> {
	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		if(arg0.length()>arg1.length())
			return 1;
		if(arg0.length()<arg1.length())
			return -1;
		return 0;
	}

}
