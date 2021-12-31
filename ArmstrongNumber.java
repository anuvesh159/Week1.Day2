package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int input = 153;
		int orgNum = input;
		int sum = 0;
		
		while( orgNum > 0) {
			
		int rem = input % 10;
		
		sum = sum + (rem*rem*rem);
		
		orgNum  = orgNum / 10;
		
		}
		
		if (sum == input) 
		
		    {
			System.out.println("Number is armstrong");
			}
			else {
				System.out.println("Number is not armstrong");
				}
		}
}


