class MathOps{
    int square(int x){
        return x * x;
    }
    
    int cube(int x){
        return x * x * x;
    }
}

public class Main {
    public static void main(String[] args) {
        
        MathOps calc = new MathOps();
        int num = 5;
        
        System.out.println("Square: " + calc.square(num));
        System.out.println("Cube: " + calc.cube(num));     
    }
}
