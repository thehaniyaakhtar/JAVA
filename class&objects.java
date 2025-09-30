// class: user defined datatype, does not occupy memory till an obj is created
// only says what properties and methods an obj will have

class Student{
    int rollno; //property- variables
    String name;
    void displau() { //behavior - methods
        System.out.println(rollno + " " + name);
    }
}

// object: real container created from class
// an object lives in heap memory, it has address not name

Student s1 = new Student();
Student s2 = new Student();
// s1 and s2 are reference variables pointing to those objects
