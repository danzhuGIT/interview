package chapterten;

public class Line {
	static double epsilon=0.000001;
	public double slope;
	public double yintercept;
	public boolean infiniteSlope;
	
	public Line(Point a, Point b){
		if(Math.abs(a.x-b.x)<epsilon)
			infiniteSlope=true;
		else {
			infiniteSlope=false;
			slope=(a.y-b.y)/(a.x-b.x);
			yintercept=a.y-slope*a.x;
		}			
	}
	
	public boolean isEqual(double a,double b)
	{
		return (Math.abs(a-b)<epsilon);
	}
	
	public int hashCode(){
		int s1=(int)(slope*1000);
		int yi1=(int)(yintercept*1000);
		return s1|yi1;
	}
	
	public boolean equals(Object o){
		Line l=(Line) o;
		if(isEqual(l.slope,slope)&&isEqual(l.yintercept,yintercept)&&
				(l.infiniteSlope==infiniteSlope))
			return true;
		else
			return false;
	}
}
