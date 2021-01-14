package Assignment2;

import java.util.Scanner;
public class BookStoreApp {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
        Book book[] = new Book[10];
        
        for (int i = 0; i < 10; i++) {
            book[i]=new Book("BOOK"+(i+1),"AUTHOR" + (i + 1),"ISBN" + (i + 1),10);
        }
        
        BookStore object = new BookStore(book);
        String option="YES";
        int choice;
        while(option.equals("YES")||option.equals("yes")){
            System.out.println("Enter Your Choice");
            System.out.println("Enter 1 for Display the Books ");
            System.out.println("Enter 2 to order new books");
            System.out.println("Enter 3 to sell books  ");
            System.out.println("Enter 0 for Exit the application ");
            choice = obj.nextInt();
                    switch (choice) {
                    case 1:
                        object.display();
                        break;
                    case 2:
                        System.out.println("Enter ISBN and Number of copies you want to order");
                        String isbn=obj.nextLine();
                        int number=obj.nextInt();
                        object.order(isbn, number);
                        break;
                    case 3:
                        System.out.println("Enter BookName and Number of copies you Sold");
                        String bookName=obj.nextLine();
                        int number1=obj.nextInt();
                        object.sell(bookName, number1);
                        break;
                    case 0:
                    	System.out.println("Thank You!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid Input");
                    }
                System.out.println("Want to continue ? (Yes/No)");
                option = obj.next();
        }
        obj.close();
    }

 

}