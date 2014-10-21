package haitaoblog;

import java.text.DecimalFormat;

public class SumProbDices {
	static int maxDiceValue=6;
	public static void main(String[] args){
		int n=2;
		
		sumProbDices(n);
	}
	
	public static void sumProbDices(int n){
		double[][] prob=new double[2][maxDiceValue*n+1];
		
		int flag=0;
		for(int i=1;i<=maxDiceValue;i++){
			prob[flag][i]=1;
		}
		
		for(int i=2;i<=n;i++){
			for(int j=i;j<=i*maxDiceValue;j++){
				prob[1-flag][j]=0;
				for(int k=1;k<=maxDiceValue&&(j-k)>0;k++){
					prob[1-flag][j]=prob[1-flag][j]+prob[flag][j-k];
				}
			}
			flag=1-flag;
		}
		DecimalFormat df=new DecimalFormat("#.0000");

		double total=Math.pow(maxDiceValue, n);
		for(int i=n;i<=maxDiceValue*n;i++){
			prob[flag][i]=prob[flag][i]/total;	
			System.out.print(df.format(prob[flag][i])+" ");
		}
	}
}
