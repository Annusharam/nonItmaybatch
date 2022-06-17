package week.day1;

public class AmstrongNumber {
	public static void main(String[] args) {
		
	}



	static boolean isAmstrong(int n)
	{ 
		int  calculator=0,reminder=0,original=0;
		original=n;
		while (calculator>0) {
			calculator=calculator/10;
			reminder++;
		}
		original=n;
		while (calculator>0) {
			calculator = calculator%10;
			calculator += (cube(reminder));
			calculator=calculator/10;
		}
		if (calculator==n)
		{
		System.out.println("amstrong");
	}
	else
	{
		System.out.println("not amstrong");
		
	
		
	}	
			
		} 

		}
			
			
			
		
	
	


