package FinalExam2;

public class Book implements Comparable<Book>{
    String name;
    double price;
   public Book(String name,double price)
   {
       this.name=name;
       this.price=price;
   }
    public double getTotalPrice()
    {
        return price+(8*price)/100;
    }
   @Override
   public int compareTo(Book o)
   {
    return (int) ((int)this.price - o.price);
   }
   @Override
   public String toString()
   {
    return "Price:"+price;
   }
   
    
}
