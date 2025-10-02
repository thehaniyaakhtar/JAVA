class Main{
    public static void main(String[] args){
        
        int[] num = {3, 7, 2, 9, 4};
        int largest = num[0];
        
        for(int i = 0; i < num.length; i++){
            if (num[i] > largest){
                largest = num[i];
            }
        }
        System.out.println("Largest number: " + largest);
    }
}
