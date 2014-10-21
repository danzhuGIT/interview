package chapterten;

public class LineOne {
	static double epsilon=0.000001;
	public double slope;
	public double yintercept;
	
	public LineOne(double s, double y){
		slope=s;
		yintercept=y;
	}
	
	public boolean intersect(LineOne l){
		return Math.abs(l.slope-this.slope)>epsilon||
				Math.abs(l.yintercept-this.yintercept)<epsilon;
	}
}
