package week3String;

public class ReverseEvenWords {
	public static void main(String[] args) {

	String test = "I am a software tester";

   
    String[] words = test.split(" ");
     
    
    for (int i = 0; i < words.length; i++) {
    
    if (i % 2 != 0) {
       
    	
    char[] characters = words[i].toCharArray();
        
    
            
    for (int j = characters.length - 1; j >= 0; j--) {
      System.out.print(characters[j]);
     }
     
      System.out.print(" ");
      } else {
        
       System.out.print(words[i] + " ");
        }
    }
}
}


