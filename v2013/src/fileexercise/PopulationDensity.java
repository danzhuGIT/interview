package fileexercise;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class PopulationDensity {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in1=new Scanner(new File("worldpop.txt"));
		Scanner in2=new Scanner(new File("worldarea.txt"));
		
		PrintWriter out=new PrintWriter("worlddensity.txt");
		while(in1.hasNextLine()&&in2.hasNextLine())
		{
			CountryValue population=new CountryValue(in1.nextLine());
			CountryValue area=new CountryValue(in2.nextLine());
			
			double density=0;
			if(area.getValue()!=0)
			{
				density=population.getValue()/area.getValue();
				
			}
			
			
		}
		
		
	}
}
