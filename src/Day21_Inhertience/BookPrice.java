package Day21_Inhertience;

import java.util.Scanner;

public class BookPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.next();
        String author = sc.next();
        int price = sc.nextInt();
        MyBook myBook = new MyBook(title,author,price);
        myBook.disp();
    }
}

class Book{
    String title;
    String author;
    Book(String title,String author)
    {
        this.title = title;
        this.author = author;
    }
}
class MyBook extends Book{
    int price;
    MyBook(String title,String author,int price)
    {
        super(title,author);
        this.price = price;
    }

    public void disp()
    {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}