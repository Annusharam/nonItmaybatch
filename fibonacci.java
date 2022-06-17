package week.day1;

public class fibonacci {
	public static void main(String[] args) {
		    int range =5;
			int firstNum=0;
	        int secNum=1,sum;
	        System.out.println(firstNum+""+secNum);
	        for(int i = 2;i<range;++i) {
			sum=firstNum+secNum;
			System.out.println(""+sum);
			firstNum=secNum;
			secNum=sum;
			}
	        
	}

}
