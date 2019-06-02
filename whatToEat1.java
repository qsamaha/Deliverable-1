package whatToEat1;

import java.util.Scanner;

public class whatToEat1 {
	public static void main (String[] args) {
		int partySize;
		String eventType;
		String result;
		
		System.out.println("Is your event casual, semi-formal, or formal?");
		Scanner sc = new Scanner(System.in);
		eventType = sc.next();
		
		System.out.println("How many people will your event have?");
		partySize = sc.nextInt();
		
		
	    result = "Since youre hosting a " + eventType + " event for " + partySize;
			
	if (eventType.equals("casual") && partySize == 1) {
			
	    result +=(" person, you should serve sandwiches prepared in the mircowave. ");


        }
        if (eventType.equals("casual") && (partySize >= 2 && partySize < 13)) {
           
            result += (" people, you should serve sandwiches prepared in your kitchen. ");


        }
        if (eventType.equals("casual") && partySize >= 13) {
            
        	result += (" people, you should serve sandwiches by a caterer. ");

        }
        if (eventType.equals("semi-formal") && partySize == 1) {
           
        	result += (" people, you should serve fried chicken prepared in the mircowave. ");


        }
        if (eventType.equals("semi-formal") && (partySize >= 2 && partySize < 13)) {
            
            result += (" people, you should serve fried chicken prepared in your kitchen. ");

         }
        if (eventType.equals("semi-formal") && partySize >= 13) {
           
            result += (" people, you should serve fried chicken by a caterer. ");
        }
        if (eventType.equals("formal") && partySize == 1) {
           
            result += (" people, you should serve chicken parmesan prepared in the mircowave. ");


        }
        if (eventType.equals("formal") && (partySize >= 2 && partySize < 13)) {
            
        	result += (" people, you should serve chicken parmesan prepared in your kitchen. ");


        }
        if (eventType.equals("formal") && partySize >= 13) {
           
        	result += (" people, you should serve chicken parmesan by a caterer. ");
        }
        else {
        	
        	System.out.println("Please enter \"casual\", \"semi-formal\", or \"formal\" in the console");
        }
		
		
		
		   System.out.println(result);

		
		
		
}

}



