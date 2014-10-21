package fileexercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class LineNumberer {
	public static void main(String[] agrs) throws FileNotFoundException{
		
		Scanner console=new Scanner(System.in);
		System.out.println("Input file:");
		String inputFileName=console.next();
		System.out.println("Output file:");
		String outputFileName=console.next();
		
		File inputFile=new File(inputFileName);
		Scanner in=new Scanner(inputFile);
		PrintWriter out=new PrintWriter(outputFileName);
		int lineNumber=1;
		
		while(in.hasNextLine()){
			String line=in.nextLine();
			out.println(lineNumber+" "+line);
			lineNumber++;
		}
	
		//Scanner inLetter=new Scanner(new File("input.txt"));
		//inLetter.useDelimiter("[^A-Za-z]+");
		//while(inLetter.hasNextInt()){
		//	int word=inLetter.nextInt();
			//System.out.println(word);
		//}
		
		in.close();
		out.close();
					
	}

}
