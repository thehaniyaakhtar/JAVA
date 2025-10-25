// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
    int[] scores = {29, 34, 53, 92, 14, 54, 92, 106};
    
    //finding sum
    int sum = 0;
    for(int score : scores){
        sum += score;
    }
    
    //finding avg
    double average = (double) sum/scores.length;
    
    //finding max
    int max = scores[0];
    for(int score : scores){
        if(score > max) max = score;
    }
    
    //finding min
    int min = scores[0];
    for(int score : scores){
        if(score < min) min = score;
    }
    
    System.out.println("Scores: 29, 34, 53, 92, 14, 54, 92, 106");
    System.out.println("Sum:" + sum);
    System.out.println("Max:" + max);
    System.out.println("Min:" + min);
    
    }
}

