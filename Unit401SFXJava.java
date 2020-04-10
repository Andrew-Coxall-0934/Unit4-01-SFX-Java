import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Class Compass
// By: Andrew Coxall
// On: April 9 2020
// Vowel counter

public class Unit401SFXJava {

  public static void main(String[] args) throws IOException {
    
    String sentence;
    int numberOfVouls = 0;
    String endCommand = "";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
    
    while(true) {
      
      System.out.print("Type a sentence: ");
  
      try {
        sentence = br.readLine();
        int length = sentence.length();
        
        for (int indexOfCharacter = 0; indexOfCharacter < length; indexOfCharacter++) {
          if ( sentence.charAt(indexOfCharacter) == "A".charAt(0) || sentence.charAt(indexOfCharacter) == "a".charAt(0) || sentence.charAt(indexOfCharacter) == "E".charAt(0) || sentence.charAt(indexOfCharacter) == "e".charAt(0) || sentence.charAt(indexOfCharacter) == "I".charAt(0) || sentence.charAt(indexOfCharacter) == "i".charAt(0)  || sentence.charAt(indexOfCharacter) == "O".charAt(0) || sentence.charAt(indexOfCharacter) == "o".charAt(0) || sentence.charAt(indexOfCharacter) == "U".charAt(0) || sentence.charAt(indexOfCharacter) == "u".charAt(0) ) {
            numberOfVouls = numberOfVouls + 1;
          }
        }  
  
        System.out.println("The sentence has " + numberOfVouls + " vowels.");
        
        System.out.print("To keep going type any letter other than A, to stop type A: ");
        endCommand = br.readLine();
        numberOfVouls = 0;
        
        if (endCommand.equals("A")) {
          break;
        }
       
      } catch(Exception e1) {
        System.out.println("You can only enter words");
      }
     
    }
    System.out.println();
    System.out.println("Done.");
  }
}  
