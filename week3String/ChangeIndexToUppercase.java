package week3String;

public class ChangeIndexToUppercase {

	public static void main(String[] args) {
		String test="changeme";
		char[] charArray= test.toCharArray();
		for(int i =0; i<charArray.length; i++) {
			if(i%2!=0) {
				charArray[i]=Character.toUpperCase(charArray[i]);
				
			}
		}
		String result= String.valueOf(charArray);
		System.out.println("Result: "+result);
		// TODO Auto-generated method stub

	}

}
