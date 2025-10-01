class Student{
    int roll;
    String name;
    
    Student() {
        roll = 0;
        name = "NA";
    }
    
    Student(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    
    void display(){
        System.out.println(roll + " " + name);
    }
}

public class Main{
    public static main void(String[] args){
        Student s1 = new Student();
        Student s2 = new Student(101, "A");
        
        s1.display();
        s2.display();
    }
}
