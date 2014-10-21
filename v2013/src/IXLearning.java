
public class IXLearning {
	static String createStateSelectList()
	{
		StringBuffer buffer=new StringBuffer();
		buffer.append("<select name=\"state\">\n");
		buffer.append("<option value=\"Alabama\">Alabama</option>\n");
		buffer.append("<option value=\"Alaska\">Alaska</option>\n");
		buffer.append("<option value=\"Arizona\">Arizona</option>\n");
		buffer.append("<option value=\"Arkansas\">Arkansas</option>\n");
		buffer.append("<option value=\"California\">California</option>\n");
		// more states here
		buffer.append("</select>\n");
		return new String(buffer);
	}
	
	static String parseSelectedState(String s)
	{
		switch(s.charAt(0)){
		case 'A':
			if ("Alabama".equals(s))     { return "AL"; }
			if ("Alaska".equals(s))      { return "AK"; }
			if ("Arizona".equals(s))     { return "AZ"; }
			if ("Arkansas".equals(s))    { return "AR"; }
			break;
		case 'C':
			if ("California".equals(s))  { return "CA"; }		
			break;
			// more states here		
		}
		return null;

	}
	
	static String displayStateFullName(String abbr) 
	{
		switch(abbr.charAt(0)){
		case 'A':
			switch(abbr.charAt(1)){
			case 'L': return "Alabama";
			case 'K': return "Alaska";
			case 'Z': return "Arizona";
			case 'R': return "Arkansas";
			}
			break;
		case 'C':
			switch(abbr.charAt(1)){
			case 'A': return "California";
			
			}	
			break;
			// more states here		
		}
		return null;
	}
}
