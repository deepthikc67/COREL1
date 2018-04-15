import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
	  Scanner ss = new Scanner(System.in);
	    System.out.print("Enter the String: ");
	    // Below Statement used for getting String including sentence
	    String s = ss.nextLine(); 
    System.out.println(Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));
    System.out.println(s.length());
  }
  
 
}


