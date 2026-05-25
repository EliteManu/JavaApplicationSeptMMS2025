import java.util.Scanner;

public class Classwork(String[] args){
	Scanner input = new Scanner(System.in);
	int day;
	
	System.out.print("Enter the day from 1-7");
	day = input.nextLine();
	
	if(day = 1){
		System.out.print("Today is Monday");
		
	}
	else if(day = 2){
	System.out.print("Today is Tuesday");
	}
	
	else if(day = 3){
	System.out.print("Today is Wednesday");
	}
	
	else if(day = 4){
	System.out.print("Today is Thursday");
	}
	
	else if(day = 5){
	System.out.print("Today is Friday");
	}
	
	else if(day = 6){
	System.out.print("Today is Saturday");
	}
	
	else if(day = 7){
	System.out.print("Today is Sunday");
	}
}