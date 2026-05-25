import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Part a
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        if (age >= 65)
            System.out.println("Age is greater than or equal to 65");
        else 
            System.out.println("Age is less than 65");
        
        // Part b
        System.out.print("\nEnter limit for part b: ");
        int limitB = sc.nextInt();
        int x = 1, total = 0;
        while (x <= limitB) {
            total += x;
            ++x;
        }
        System.out.println("Total b: " + total);
        
        // Part c
        System.out.print("\nEnter limit for part c: ");
        int limitC = sc.nextInt();
        x = 1;
        total = 0;
        while (x <= limitC) {
            total += x;
            ++x;
        }
        System.out.println("Total c: " + total);
        
        // Part d
        System.out.print("\nEnter start value for part d: ");
        int y = sc.nextInt();
        while (y > 0) {
            System.out.println(y);
            --y;
        }
        
        sc.close();
    }
}