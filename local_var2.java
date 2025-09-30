public class Main{
    static void fun(){
        int x = 50; 
        System.out.println(x);
    }
    
    public static void main(String[] args){
        int x = 30; //local variable, belongs only to main
        fun(); // new local variable
        fun(); // Again creates a new local
        System.out.println("\n" + x);
    }
}

// op: 5050 /n 30
// Each method has its own local space.
// Local variables with the same name in different methods do not interfere with each other
