package DayCondition;

public class SwitchCase {

	public static void main(String[] args) {
		int day =8;
		switch(day)  {
		case 1:
			System.out.println("hi today is monday");
			break;  //optional
		case 2:
			System.out.println("hi today is tuesday");
			break;
		case 3:
			System.out.println("hi today is wensday");
	        break;
		case 4:
		    System.out.println("hi today is thursday");
		    break;
		case 5:
			System.out.println("hi today is friday");
			break;
		case 6:
			System.out.println("hi today is saturday");
			break;
		case 7:
			System.out.println("hi today is sunday");
	        break;
	    default:
	    	System.out.println("sorry non of above case are match");
	    	break;
	    	
	    
		}
	}

}
