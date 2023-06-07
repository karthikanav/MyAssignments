package week3Array;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int []array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		for (int i=0; i<array.length-1; i++) {
			int count =0;
			for (int j=i+1; j<array.length; j++) {
				if(array[i]==array[j]) {
					System.out.println("Duplicate: "+array[i]);
					count++;
					break;
					
					
				}
			}
		}
		// TODO Auto-generated method stub

	}

}
