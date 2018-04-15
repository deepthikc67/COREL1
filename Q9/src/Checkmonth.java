import java.util.Scanner;


public class Checkmonth {
	int dd1,mm1,yyyy1;
	int dd,mm,yyyy;
	static int m;
	 int m(){
		System.out.println(mm1-mm);
	if(mm1>mm){
	     m= mm1-mm;
		}
		return mm1-mm;
	 }
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("enter the format dd-mm-yyy");
	int dd,mm = 0,yyyy=s.nextInt();
	Scanner s1=new Scanner(System.in);
	System.out.println("enter the format dd-mm-yyy");
	int dd1,mm1 = 0,yyyy1=s1.nextInt();
	System.out.println(m);
}

}
