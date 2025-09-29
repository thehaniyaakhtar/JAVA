import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        
        if(age>35){
            System.out.println("OK");
        }
        
        else{
            System.out.print("NO");
        }
        
    }
}
