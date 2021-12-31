package week1.day2;

public class LearnJumpStatements {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++){
			
			if (i==3){
				
				System.out.println("three");
				continue;
			
			}
			
			if (i==5) {
				
				System.out.println("five");
				break;
			}
			
			   System.out.println(i);
		}
	}

}
