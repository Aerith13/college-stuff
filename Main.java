import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    System.out.println("Input the String: ");
    String str=in.nextLine();
    System.out.println("Input the word you want to replace from your input:");
    String previousWord=in.nextLine();
    System.out.println("Replace the word with what?");
    String newWord=in.nextLine();
    if(str.contains(previousWord)) {
		System.out.println(str.replace(previousWord, newWord));
	}
	else{
		System.out.println("String/Character to replace is not found");
	}
     in.close();   
        
      }
}