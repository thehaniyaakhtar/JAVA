import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        int odd = 0;
        int even = 0;
        
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2 == 0){
                even += 1;
            
            }
            else{
                odd += 1;
                
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
}
