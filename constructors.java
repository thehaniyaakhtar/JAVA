// Constructors 
// special method called automatically when an object is created
// used to initialize values of object

// default constructor and non default constructor
class Student {
    int roll;
    String name;
}

Public class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.roll);
        System.out.println(s1.name);
    }
}

// no parameters
// it created an object and sets default values: 0 numbers, strings null, boolean false

// non default constructor takes parameters to initialize obj
// this is used to avoid confusion

class Student{
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
    
    void display(){
        System.out.println(roll + " " + name);
    }
}

public class Main{
    public static void main(String[] args){
        Student s1 = new Student(101, "A");
        Student s2 = new Student(102, "B");
        
        s1.display();
        s2.display();
    }
}









