class Main{
    public static void main(String[] args){
        int[] nums = {10, 20, 30, 40, 50};
        boolean found = false;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 30){
                found = true;
                break;
            }
        }
        
        if (found){
            System.out.println("30 is there");
        } else {
            System.out.println("30 is not there");
        }
    }
}
