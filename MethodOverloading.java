import java.util.Scanner;

public class MethodOverloading {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("Enter 1 for Square, 2 for Rectangle, 3 for Triangle: ");
        choice = scan.nextInt();

        switch (choice) {
            case 1: {
                System.out.print("Enter the length of the Square: ");
                int lenOfSquare = scan.nextInt();
                perimeter(lenOfSquare);
                break;
            }
            case 2: {
                System.out.print("Enter the length of the Rectangle: ");
                int lenOfRect = scan.nextInt();
                System.out.print("Enter the width of the Rectangle: ");
                int widthOfRect = scan.nextInt();
                perimeter(lenOfRect, widthOfRect);
                break;
            }
            case 3: {
                System.out.print("Enter the length of the Triangle: ");
                int sideA = scan.nextInt();
                System.out.print("Enter the length of the second side of the Triangle: ");
                int sideB = scan.nextInt();
                System.out.print("Enter the length of the third side of the Triangle: ");
                int sideC = scan.nextInt();
                perimeter(sideA, sideB, sideC);
                break;
            }
            default: {
                System.out.println("Invalid choice. Program Exited, Good Bye.......");
                break;
            }
        }
        scan.close();
    }

    public static void perimeter(int lenOfSquare) {
        int perimeterOfSquare = 4 * lenOfSquare;
        System.out.println("The perimeter of the Square is " + perimeterOfSquare);
    }

    
    public static void perimeter(int lenOfRect, int widthOfRect) {
        int perimeterOfRectangle = 2 * (lenOfRect + widthOfRect);
        System.out.println("The perimeter of the Rectangle is " + perimeterOfRectangle);
    }

   
    public static void perimeter(int sideA, int sideB, int sidec) {
        int perimeterOfTriangle = sideA + sideB + sidec;
        System.out.println("The perimeter of the Triangle is " + perimeterOfTriangle);
    }
}
