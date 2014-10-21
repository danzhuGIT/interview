package leetCode;

public class ZigzagConvert {
	public static void main(String[] args){
		System.out.print(zigzagConvert("PAYPALISHIRING",3));
	}
	public static String zigzagConvert(String str, int nRow){
		StringBuffer[] buffers=new StringBuffer[nRow];
		for(int i=0;i<nRow;i++){
			buffers[i]=new StringBuffer();
		}
		
		for(int i=0;i<str.length();i++){
			int j=i%(2*nRow-2);
			if(j<(nRow-1)){
				buffers[j].append(str.charAt(i));
			}
			else{
				j=j%(nRow-1);
				buffers[nRow-1-j].append(str.charAt(i));
			}
			
		}
		
		StringBuffer result=new StringBuffer();
		for(int i=0;i<nRow;i++){
			result.append(buffers[i]);
		}
		return new String(result);
	}
}
