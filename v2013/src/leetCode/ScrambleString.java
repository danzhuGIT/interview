package leetCode;

public class ScrambleString {
    public boolean isScramble(String s1, String s2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int n=s1.length();
        if(n==1)
            return s2.equals(s1);

        for(int i=1;i<=n/2;i++){
            String x1=s1.substring(0,i),x2=s1.substring(i);
            String a1=s1.substring(n-i),a2=s1.substring(0,n-i);
            String y1=s2.substring(0,i),y2=s2.substring(i);
            String b1=s2.substring(n-i),b2=s2.substring(0,n-i);
            
            boolean r1=isScramble(x1,y1)&&isScramble(x2,y2);
            if(r1) return true;
            boolean r2=isScramble(x1,b1)&&isScramble(x2,b2);
            if(r2) return true;
            boolean r3=isScramble(a1,y1)&&isScramble(a2,y2);
            if(r3) return true;
            boolean r4=isScramble(a1,b1)&&isScramble(a2,b2);
            if(r4) return true;
            
        }
        return false;
    }
}
