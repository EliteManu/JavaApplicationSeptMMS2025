import java.util.Scanner;
public class Employee{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);

    System.out.print("Name: ");
    String n = s.nextLine();
    System.out.print("Hours worked: ");
    int h = s.nextInt();
    System.out.print("Rate per hour: ");
    int r = s.nextInt();

    int gross = h * r;
    int tax = gross * 10 / 100; // 10% tax
    int net = gross - tax;

    System.out.println("Gross Salary: " + gross);
    System.out.println("Tax: " + tax);
    System.out.println("Net Salary: " + net);
  }
}