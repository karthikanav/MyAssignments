package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		  int number=17;
	      boolean count=false;
	      for (int i=2;i<=number/2;i++) {
	        if (number%i !=0) {
	    		  count=true;
	    		  break;
	    	  }
	      }
	    	  
		if (count) {
			System.out.println("It is a prime number");
		}else
			System.out.println("It is not a prime number");
		// TODO Auto-generated method stub

	}

}
