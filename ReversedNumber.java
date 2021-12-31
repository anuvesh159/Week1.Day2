package week1.day2;

public class ReversedNumber {

	public static void main(String[] args) {
		 int num = 34343, reversedNum = 0, remainder;
		 
		 int org = num;
		 
		 
		 while(num !=0) {
		 remainder = num % 10;
		 reversedNum = reversedNum * 10 + remainder;
		 num /= 10;
		 }
         if (org == reversedNum) {
        	 System.out.println(org +" : " +"is a palindrome");
         }
         else {
        	 System.out.println(org +" : " +"is not a palindrome");
         }
         
         
	}
	
	

}
