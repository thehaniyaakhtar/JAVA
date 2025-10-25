// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        String[] names = {"A", "B", "C"};
        
        System.out.println("====All Names====");
        for(int i = 0; i<names.length; i++){    // <= is ArrayIndexOutOfBoundsException
            System.out.println("Index " + i + ":" + names[i]);
        }
        
        int[] numbers = {10, 20, 30};
        System.out.println("\n====All Numbers====");
        for(int i =0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
