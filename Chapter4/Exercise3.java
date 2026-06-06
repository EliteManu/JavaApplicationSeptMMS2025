import java.util.Scanner;

public class Exercise3 {
    
    
    public static int getChoice() {
        Scanner input = new Scanner(System.in);
        System.out.print("1=Square, 2=Cube, 3=Exit: ");
        return input.nextInt();
    }
    
    public static void main(String[] args) {
        int choice;
      
        while (true) {
			
            choice = getChoice(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter number: ");
                    int n1 = new Scanner(System.in).nextInt();
                    System.out.println("Square = " + Math.pow(n1, 2));
                    break;
                case 2:
                    System.out.print("Enter number: ");
                    int n2 = new Scanner(System.in).nextInt();
                    System.out.println("Cube = " + Math.pow(n2, 3));
                    break;
                case 3:
                    break; 
            }
            
            if (choice == 3)
                break; 
            else if (choice != 1 && choice != 2) {
                System.out.println("Invalid choice");
                continue; 
            }
        }
        
        System.out.println("Done");
    }
}