class Book{
    String title;
    String author;
    
    Book(){
        title = "Unknown";
        author = "Anonymous";
    }
    
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }
    
    void display(){
        System.out.println(title + " by " + author);
    }
        
}

public class Main{
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("X", "Y");
        
        b1.display();
        b2.display();
    }
}
