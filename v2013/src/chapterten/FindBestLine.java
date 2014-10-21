package chapterten;

import java.util.HashMap;

public class FindBestLine {
	public static void main(String[] args){
		Point[] graph={new Point(1,1),new Point(1,2),new Point(3,4),new Point(1,4)};
		HashMap<Line,Integer> linecount=new HashMap<Line,Integer>();
		Line bestLine=null;
		for(int i=0;i<graph.length;i++){
			for(int j=i+1;j<graph.length;j++){
				Line l=new Line(graph[i],graph[j]);
				if(!linecount.containsKey(l))
					linecount.put(l, 0);
				else
					linecount.put(l,linecount.get(l)+1);
				if(bestLine==null||linecount.get(l)>linecount.get(bestLine))
					bestLine=l;
			}
		}
		System.out.print(bestLine.slope+" "+bestLine.yintercept+" "+bestLine.infiniteSlope);
	}
}
