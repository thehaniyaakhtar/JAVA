// static methods belong to class 
// can be called using classname.methodname()
// cannot access instance variabes as they belong to objects

class Calc{
    static int square(int x){
        return x * x;
    }
}

public class Main{
    public static void main(String[] args){
        System.out.println(Calc.square(7))
    }
}
