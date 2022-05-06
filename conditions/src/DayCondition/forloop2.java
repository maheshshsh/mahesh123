package DayCondition;

public class forloop2 {
     char c ='a';
	public static void main(String[] args) {
		// for the print a to z char
		
		for(char c= 'a';  c<='z' ;c++) {
			
			System.out.print(c);
		}
		
		System.out.println("*****print in capitalal******");
		
		for(char c1='A';c1<='Z'; c1++) {
			
			System.out.println(c1+"");
		}
System.out.println("*****print reverse****");
       
         for(char c2='z'; c2>='a';c2--) {
        	 System.out.println(c2);
         }
	}

}
