import java.util.Scanner;

public class BookArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] books = new String[10]; 

       
        System.out.println("Enter 10 book titles:");
        for(int i = 0; i < 10; i++) {
            System.out.print("Book " + (i+1) + ": ");
            books[i] = input.nextLine();
        }

  
        System.out.println("\n--- All Books in Library ---");
        for(int i = 0; i < books.length; i++) {
            System.out.println((i+1) + ". " + books[i]);
        }

        System.out.print("\nEnter book title to search: ");
        String search = input.nextLine();
        boolean found = false;

        for(int i = 0; i < books.length; i++) {
            if(books[i].equalsIgnoreCase(search)) { 
                System.out.println("Book found at position " + (i+1));
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("Book not found.");
        }

        input.close();
    }
}