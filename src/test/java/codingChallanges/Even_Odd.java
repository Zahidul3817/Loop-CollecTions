package codingChallanges;

public class Even_Odd {
	
	// How to find out the even number? How to find out the odd number? 
		// Even--> 2,4,6,8,10
		//Odd--> 1,3,5,7,9
		
		public static void main(String[] args) {
			for(int i=0;i<=10;i++) {
			if(i%2==0) {// %=mod
				System.out.println("This is my even number : " + i);
				
			}
			else {
			System.out.println("This is my odd number : " + i);
				
			}
			}
			
			
			
			for(int i=0; i<20;i++) {
				if(i%2==0) {
					//System.out.println(i);
					
				}
				else {
					//System.out.println(i);
				}
			}

		}

	}

