// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        // initializing the array
        int[] emptyScores = new int[4];
        
        emptyScores[0] = 70;
        emptyScores[1] = 25;
        emptyScores[2] = 91;
        emptyScores[3] = 18;
        
        String[] names = {"a", "b", "c"};
        
        System.out.println("First name:" + names[0]);
        System.out.println("Second name:" + names[1]);
        
        System.out.println("Number of names:" + names.length);
        System.out.println("Number of scores:" + emptyScores.length);
        
        System.out.println("Last Name:" + names[names.length - 1]);
        System.out.println("Last Score:" + emptyScores[emptyScores.length-1]);
        
        System.out.println("\n-------All Names----------");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        
        System.out.println(emptyScores[0]);
        System.out.println(emptyScores[1]);
        System.out.println(emptyScores[2]);
        
        names = new String[]{"E", "F"};
        System.out.println("\nAfter re-init, first name: " + names[0]);
        System.out.println("New size:" + names.length);
    }
}
