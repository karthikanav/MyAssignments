package week1.day2;

public class Factorial {

	public static void main(String[] args) {
int number = 5; 
        
        int factorial = 1;
       
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + number + " is: " + factorial);
		// TODO Auto-generated method stub

	}

}
