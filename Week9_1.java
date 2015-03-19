import java.util.Scanner;

public class Week9_1 {
	//TOOO Auto generated method stub
public static void main(String[] args){
	
    Scanner keyboard = new Scanner(System.in);
	System.out.println("Please choose your role");
	
	System.out.println(" Administrator ,Faculty ,Staff ,Student ,Guest");
    String role = keyboard.next();
    
    switch(role){
    case "Administrator" :
    System.out.println("Welcome Administrator");
        break;
    case "Faculaty":
    	System.out.print("Welcome Faculty");
        break;
    case "Staff":
    	System.out.println("Welcome Staff");
    	break;
    case "Student":
    	System.out.println("Welcome Student");
        break;
    case "Guest":
    	System.out.println("Welcome Guest");
        break;
         }
    
}
   }