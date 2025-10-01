// static: one common copy of varible/mathod shared by all objects
// belong to classes not objects
// cannot use this, this refers to objects
// runs once when the class is loaded

class Student {
    int roll;
    String name;
    static String college;
    
    Student(int r, String n) {
        roll = r;
        name = n;
    }
    
    void display(){
        System.out.println(roll + " " + name + " " + college);
    }
}

public class Main{
    public static void main(Sring[] args){
        Student.college = "Greenwood";
        
        Student s1 = new Student(1, "A");
        Student s2 = new Strudent(2, "B");
        
        s1.display();
        s2.display();
    }
}
