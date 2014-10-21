package chaptereight;



public class PainColor {
	enum Color{Black, White, Red, Blue, Green};
	
	public static void main(String[] args){
		
		Color ocolor=Color.White;
		Color ncolor=Color.Red;
		int m=2;
		int n=2;
		Color[][] screen=new Color[m][n];
		for(int i=0;i<screen.length;i++)
			for(int j=0;j<screen[0].length;j++)
				screen[i][j]=ocolor;
		paintFill(screen,m-1,n-1,ocolor,ncolor);
	}
	
	public static void paintFill(Color[][] screen, int x, int y, Color ocolor, Color ncolor){
		if(x<0||x>=screen.length||y<0||y>=screen[0].length)
			return;
		else {
			if(screen[x][y]==ocolor){
				screen[x][y]=ncolor;
				System.out.print("["+x+","+y+"]"+ncolor+" ");
				paintFill(screen,x-1,y,ocolor,ncolor);
				paintFill(screen,x+1,y,ocolor,ncolor);
				paintFill(screen,x,y-1,ocolor,ncolor);
				paintFill(screen,x,y+1,ocolor,ncolor);
			}
		}
	}
}
