import java.util.Scanner;

public class Exercise2 {
    
    public static double squareRoot(double num) {
        if (num < 0)
            return -1; 
        return Math.sqrt(num);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter a number, -1 to quit: ");
            double n = input.nextDouble();
            
            if (n == -1)
                break; 
            
            if (n < 0) {
                System.out.println("Negative not allowed");
                continue; 
            }
            
            double result = squareRoot(n); 
            System.out.println("Square root = " + result);
        }
        
        System.out.println("Program ended");
    }
}