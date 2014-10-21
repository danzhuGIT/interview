import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RoboticRover {
		public static int row=0;
		public static int column = 0;
		
	public static void main(String[] args) throws FileNotFoundException{
		int[] pos=new int[2];
		char dir=0;
		char[] instruction;
		String input;
		
		Scanner console=new Scanner(System.in);
		System.out.println("Input file and path:");
		String inputFileName=console.next();
		System.out.println("Output file and path:");
		String outputFileName=console.next();
		
		File inputFile=new File(inputFileName);
		Scanner in=new Scanner(inputFile);
		PrintWriter out=new PrintWriter(outputFileName);
		
		while(in.hasNextLine()){
			input=in.nextLine();
			String[] arr=input.split(" ",0);
			//record map range
			if(arr.length==2){
				row=Integer.parseInt(arr[0]);
				column=Integer.parseInt(arr[1]);
			}
			//record original position
			else if(arr.length==3){
				pos[0]=Integer.parseInt(arr[0]);
				pos[1]=Integer.parseInt(arr[1]);
				dir=arr[2].charAt(0);
			}
			//go under instruction
			else{
				instruction=arr[0].toCharArray();
				int i=0;
				while(i<instruction.length){
					if(instruction[i]=='M'){
						pos=move(pos,dir);
					}
					else
						dir=changeDir(dir, instruction[i]);
					i++;
				}
				if(pos[0]<=column&&pos[1]<=row&&pos[0]>=0&&pos[1]>=0){
					out.println(pos[0]+" "+pos[1]+" "+dir);
				}
				else
					out.println("Moving out of the plateau");
			}		
		}
		in.close();
		out.close();
	}
	
	//return the position and direction after moving if it does not walk outside of range.
	public static int[] move(int[] pos, char dir){

		switch(dir){
		case 'E':
			pos[0]=pos[0]+1;
			break;
		case 'W':
			pos[0]=pos[0]-1;
			break;
		case 'N':
			pos[1]=pos[1]+1;
			break;
		case 'S':
			pos[1]=pos[1]-1;
			break;	
		}
		return pos;
	}
	//return direction after changing direction
	public static char changeDir(char old, char change){
		char[] dirSet={'E','N','W','S'};
		int i=0;
		while(i<dirSet.length){
			if(dirSet[i]==old)
				break;
			i++;
		}
		
		switch(change){
		case 'L':
			i=i+1;
			break;
		case 'R':
			i=i-1;
			break;
		}
		
		if(i<0)
			i=i+4;
		
		return dirSet[i%4];
	}
}
