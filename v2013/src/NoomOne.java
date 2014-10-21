
public class NoomOne {
	public static void main(String[] args){
		String input="73167176531330624919225119674426574742355349194934";	
		input=input+"96983520312774506326239578318016984801869478851843";
		input=input+"85861560789112949495459501737958331952853208805511";
		input=input+"12540698747158523863050715693290963295227443043557";
		input=input+"66896648950445244523161731856403098711121722383113";
		input=input+"62229893423380308135336276614282806444486645238749";
		input=input+"30358907296290491560440772390713810515859307960866";
		input=input+"70172427121883998797908792274921901699720888093776";
		input=input+"65727333001053367881220235421809751254540594752243";
		input=input+"52584907711670556013604839586446706324415722155397";
		input=input+"53697817977846174064955149290862569321978468622482";
		input=input+"83972241375657056057490261407972968652414535100474";
		input=input+"82166370484403199890008895243450658541227588666881";
		input=input+"16427171479924442928230863465674813919123162824586";
		input=input+"17866458359124566529476545682848912883142607690042";
		input=input+"24219022671055626321111109370544217506941658960408";
		input=input+"07198403850962455444362981230987879927244284909188";
		input=input+"84580156166097919133875499200524063689912560717606";
		input=input+"05886116467109405077541002256983155200055935729725";
		input=input+"71636269561882670428252483600823257530420752963450";
		
		int product=1;
		for(int i=0;i<5;i++){
			product=product*Character.getNumericValue(input.charAt(i));
		}
		int max_product=product;
		
		int start=0;
		while(start<input.length()-5){
			if(Character.getNumericValue(input.charAt(start))!=0)
				product=product/Character.getNumericValue(input.charAt(start))*Character.getNumericValue(input.charAt(start+5));			
			else{
				product=1;
				for(int i=start+1;i<start+6;i++){
					product=product*Character.getNumericValue(input.charAt(i));
				}
			}
			if(product>max_product)
				max_product=product;
			start++;
		}
		System.out.print(max_product);
	}
}
