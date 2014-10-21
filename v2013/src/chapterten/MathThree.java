package chapterten;

public class MathThree {
	public static void main(String[] args){
		LineOne a =new LineOne(1,1.3);
		LineOne b=new LineOne(2,1.4);
		if(a.intersect(b))
			System.out.println("Line a and Line b intersect");
		else
			System.out.println("Line a and Line b do not intersect");
	}

}
