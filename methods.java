// methods: exists in a class
// can take input called paramters
// performs some action
// returns an output, if void then nothing

class Calculator{
    int add(int a, int b){  // Method has input and output
        return a + b;       
    }
    
    void sayHello(){           // Method has no input and output
        System.out.println("Hello");
    }
}

public class Main{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        int sum = calc.add(10, 20);
        System.out.println(sum);
        
        calc.sayHello();
        
    }
}
