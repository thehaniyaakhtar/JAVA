class SchoolStudent{
    String studentName;
    static String schoolName = "GreenWood High";
    
    void info(){
        System.out.println("Name: " + studentName + "School: " + schoolName);
    }
}

public class Main{
    public static void main(String[] args){
        SchoolStudent s1 = new SchoolStudent();
        s1.studentName = "Ayesha";
        s1.info();
        
        SchoolStudent s2 = new SchoolStudent();
        s2.studentName = "Rahul";
        s2.info();
        
        SchoolStudent.schoolName = "Blue Ridge School";
        s1.info();
        s2.info();
    }
}

/*
Name: Ayesha | School: GreenWood High
Name: Rahul  | School: GreenWood High
Name: Ayesha | School: Blue Ridge School
Name: Rahul  | School: Blue Ridge School
*/
