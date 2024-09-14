package parivar;
import java.util.Scanner;

class Library{
    public String[] books;
    int numberOfBooks;
    Library(){
        this.books=new String[100];
        
    }
    public void addBook(String nameOfBook){
         for (int i = 0; i < books.length; i++) {
            if (books[i]==null) {
                this.books[i]=nameOfBook;
                break;
            }
         }
         System.out.println(nameOfBook+" Book has been added\n");
    } 
    public void issueBook(String nameofBook){
          for (int i = 0; i < books.length; i++) {
               if (nameofBook.equalsIgnoreCase(books[i])) {
                books[i]=null;
                break;
               }
          }
          System.out.println(nameofBook+" Book has been issued\n");
    }
    public void returnBook(String nameofBook){
        for (int i = 0; i < books.length; i++) {
            if (books[i]==null) {
                this.books[i]=nameofBook;
                break;
            }
         }
         System.out.println(nameofBook+" Book has been returned\n");
    }
    public void showAvailableBook(){
        System.out.println(" Available books : ");
          for (int index = 0; index < books.length; index++) {
            if (books[index]==null) {
                continue;
            }
            System.out.println(" * "+books[index]);
          }
          System.out.println();
    }

}
public class OnlineLibrary {

    public static void main(String[] args) {
       
        Library stateLibrary=new Library();
        Scanner scan=new Scanner(System.in);
        while (true) {
            System.out.println("Enter A for add book\nI for issue book\nR for return book \nS for show available book ");
            char key=scan.next().charAt(0);
            switch (key) {
                case 'A' ->{stateLibrary.addBook(scan.nextLine());}
                case 'I' ->{stateLibrary.issueBook(scan.nextLine());}
                case 'R' ->{stateLibrary.returnBook(scan.nextLine());}
                case 'S' ->{stateLibrary.showAvailableBook();}
                
            }
        }
    }
}