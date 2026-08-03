package main;

import java.time.LocalDate;
//import school.Student;
import school.GraduateStudent;
import school.UnderGraduateStudent;
import java.util.Scanner;


public class SchoolManagmentSystemApp {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 1: For Graduate Student");
        System.out.println("Enter 2: For UnderGraduate Student");
        
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        
                System.out.print("Enter your student ID: ");
                int studentID = scan.nextInt();
                
                System.out.print("Enter First Name");
                String firstName = scan.nextLine();
                
                System.out.print("Enter Last Name");
                String lastName = scan.nextLine();
                
                System.out.print("Enter Gender");
        switch(choice){
            case 1: {
                char gender = scan.next().charAt(0);
                
                System.out.print("Enter Dirth Of Birth(YYY-MM-DD");
                String dateOfBirth = scan.nextLine();
                
                System.out.print("Enter Phone Number");
                String phoneNumber = scan.nextLine();
                
                System.out.print("Enter Final Year Project");
                String finalYearProject = scan.nextLine();
                
                GraduateStudent gStudent = 
                        new GraduateStudent(studentID,firstName,lastName,
                        gender, LocalDate.parse(dateOfBirth), 
                                phoneNumber,finalYearProject);
                gStudent.displayStudentInfo();
            }
            case 2:  {
                System.out.print("Enter your student ID: ");
                studentID = scan.nextInt();
                System.out.print("Enter First Name: ");
                firstName = scan.nextLine();
                
                System.out.print("Enter Last Name: ");
                lastName = scan.nextLine();
   
           
                System.out.print("Enter Gender");
                char gender = scan.next().charAt(0);
                
                System.out.print("Enter Dirth Of Birth(YYY-MM-DD");
                String dateOfBirth = scan.nextLine();
                
                System.out.print("Enter Phone Number");
                String phoneNumber = scan.nextLine();
                
                System.out.print("Enter Level");
                int level = scan.nextInt();
                
                UnderGraduateStudent ugStudent = 
                        new UnderGraduateStudent(studentID,firstName,lastName,
                        gender, LocalDate.parse(dateOfBirth), 
                                phoneNumber,level);
                
                ugStudent.displayStudentInfo();
        }
            break;
            default:
                System.out.println("Invalid Input");
            break;
        }
    
    }
        
 
    
}