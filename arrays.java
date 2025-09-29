public class Main{
    public static void main(String[] args){
       int [] marks = {1, 2, 3, 5};
       marks[3] = 34;
       System.out.println(marks[0]);
       System.out.println(marks[3]);
       for (int i= 0; i<marks.length; i++){
           System.out.println(marks[i]);
       }
    }
}
