class Main{
    public static void main(String[] args){
        
        // arrays: rows of boxes that store the same data type
        // Declaring an array
        int [] number;
        String[] names;
        // Nothing is created in memory yet
        // Only tells JAVA, I will have an array of this type
        
        // Creating an array
        number = new int[5];
        names = new String[3];
        // delaring size of the array
        // by default number = 0, strings = null
        
        //initializing array values
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        
        String[] fruits = {"Apple", "Banana", "Mango"}; // declare + initialize in one line
        
        // accessing array values
        System.out.println(number[1]);
        System.out.println(fruits[2]);
        
        // Looping through an array
        
        for(int i = 0; i<number.length; i++ ) {
            System.out.println(number[i]);
        }
        
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
        
        System.out.println(number.length);
    }
}

