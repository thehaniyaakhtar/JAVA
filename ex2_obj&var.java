class student{
    String name;
    
    void display(){
        String msg = "hello";
        System.out.println(msg + name);
    }
}

public class Main{
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "A";
        s1.display();
        
        student s2 = new student;
        s2.name = "B";
        s2.display();
    }
}
