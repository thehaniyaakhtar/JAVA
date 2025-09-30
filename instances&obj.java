// instance variables: belong to each object seperately
// everytime an object is created, a new copy of variables is also created
class Student{
    int roll_number;               // instance variable
    String name;                   // instance variable
    static String college = "ABC"; // static variable
    void teach(){
        int lessons = 5;
        System.out.println("Teaching lesson" + lessons)
    } // lesson no only exists inside teach
}

Student s1 = new Student();
s1.rollno = 1;
s1.name = "a";

Student s2 = new Student();
s2.rollno = 2;
s2.name = "b";

System.out.println(s1.college);
System.out.println(s2.college);     // only one ocpy of college exists, shared by both

// both s1 and s2 are independent
