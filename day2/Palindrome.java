package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343;
		int number=num;
		int temp=0;
		for (int i=num;i>0;i=i/10)
		{
			temp=temp*10+num%10;
			num=num/10;
		}
		if (number==temp) {
			System.out.println("palindrome number");
		}else
		System.out.println("not a palindrome number");
		// TODO Auto-generated method stub

	}

}
