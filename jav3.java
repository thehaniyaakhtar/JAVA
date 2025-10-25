// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        int[] scores = {98, 38, 20, 55};
        
        System.out.println("====All scores====");
        for(int score : scores) {
            System.out.println("Scores: " + score);
        }
        
        String[] fruits = {"aa", "bb", "cc"};
        System.out.println("\n====All Fruits====");
        for(String fruit : fruits) {
            System.out.println(fruit.toUpperCase());
        }
    }
}

//Classic for (i = 0; i < length; i++)You need index (e.g. print position, modify array)Enhanced for (for-each)You only need the values (read-only)
