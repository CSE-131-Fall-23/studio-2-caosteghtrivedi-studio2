package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please Enter your starting amount: ");
        double startAmount = in.nextDouble();
		
        System.out.println("Please Enter your win chance: ");
        double winChance = in.nextDouble();
        
        System.out.println("Please Enter your win limit: ");
        double winLimit = in.nextDouble();
        
        System.out.println("Please enter the number of simulations: ");
        int totalSimulations = in.nextInt();
        
     int winNumber = 0;
        for (int x = 1; x <= totalSimulations; x++) {
        	double startAmount2 = startAmount;
        	int whileloopcount = 0;
        	
        	while (startAmount2 > 0 && startAmount2 <= winLimit - 1) {
        		
        		whileloopcount++;
        		
        		if(Math.random() > winChance) {
        		startAmount2 = startAmount2 - 1;
        
        	}
        	else {
        		startAmount2 = startAmount2 + 1;
        	
        	}
        	
        }
        	if (startAmount2 == winLimit) {
        	    winNumber++;
        		System.out.println("Simulation " + x + ": " + whileloopcount + " WIN");
        	}
        	else {
        		System.out.println("Simulation " + x + ": " + whileloopcount + " LOSE");
        	}
        	 
        	
        
        }
System.out.println("WINS: " + winNumber);
	}

}
