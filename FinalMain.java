package FinalExam2;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FinalMain {
    public static void main(String[] args) {
     Book b1=new Book("Book 1", 500);
     Book b2=new Book("Book 2", 785);
     Book b3=new Book("Book 3", 478);
     Book b4=new Book("Book 4", 987);

     List<Book> books=new LinkedList<>();
     books.add(b1);
     books.add(b2);
     books.add(b3);
     books.add(b4);
    Collections.sort(books);
     Iterator<Book> itr=books.iterator();

     while(itr.hasNext())
     {
        System.out.println(itr.next());
       
     }
     

    }
     

}
