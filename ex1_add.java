class Calculator {
    int a, b;
    
    void add(){
        System.out.println("The result is: ", int a + int b);
    }
}

public class Main(){
    public static void main(String[] args){
        Calculator myCalc = new Calculator();
        myCalc.a = 2;
        myCalc.b = 3;
        myCalc.add();
    }
}
