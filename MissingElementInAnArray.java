package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,7,6,8,10};
		
		Arrays.sort(arr);
		
		int Elements = arr.length+1;
		
		int Total = Elements * (Elements +1)/2 ;
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++)
			
		{
			sum = sum + arr[i];
			
		}
		
		System.out.println("Missing Element is "+(Total-sum));
		
		
}
}