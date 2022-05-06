package DayCondition;

public class PrimeNumberNew {

	public static void main(String[] args) {
		int num1=9;
		int count =0;
		for(int i = 1; i<=num1;i++) {
			
	if (num1%i==0) {
		++count;
		
	}
	
	
		}
	if(count==2)  {
			System.out.println("this is prime num:"+num1);
			
		}else {
			System.out.println("this is not prime num:"+num1);
	}

	}
}
