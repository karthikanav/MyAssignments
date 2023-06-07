package week3String;

public class RemoveDuplicates {

	  public static void main(String[] args) {
	        String text = "We learn java basics as part of java sessions in java week1";
	        String[] words = text.split(" ");
	        for (int i = 0; i < words.length; i++) {
	            int count = 0;
	            for (int j = 0; j < words.length; j++) {
	                if (words[i].equals(words[j])) {
	                    count++;
	                }
	            }
	            if (count > 1) {
	                words[i] = ""; 
	            }
	        }
	        String result = String.join(" ", words);
	        System.out.println("Result: " + result.trim()); // Trim the result to remove leading/trailing spaces
	    }
	}