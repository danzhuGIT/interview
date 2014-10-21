package fileexercise;

public class CountryValue {
	private String country;
	private int value;
	
	public CountryValue(String line) {
		int i=0;
		while(!Character.isDigit(line.charAt(i)))	i++;
		int j=i-1;
		while(Character.isWhitespace(line.charAt(j)))	j--;
		country=line.substring(0,j+1);
		value=Integer.parseInt(line.substring(i).trim());
	}
	
	public String getCountry()
	{	return country;	}
	
	public int getValue()
	{	return value;	}
}
