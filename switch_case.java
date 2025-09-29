import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        
        switch(age){
            case 12:
                System.out.println("You are 12");
                break;
            case 56:
                System.out.println("You are 56");
                break;
            case 16:
                System.out.println("You are 16");
                break;
            default:
                System.out.println("OK");
        }
    }
}
