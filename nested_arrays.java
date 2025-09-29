public class Main{
    public static void main(String[] args){
        int x[] = {3, 5, 7}; //OR
        int y[] = new int[]{5, 20, 25}
        System.out.println(x[2]);
        System.out.println(x.length);
    }
}

//x is a reference variable containing address and pointing at the object created that stores array
// Default value of array: 0

// Creating a nested array

public class Main{
    public static void main(String[] args){
        int x[][] = new int[5][3];
        x[2][2] = 22; //2nd array, 2nd position
        x[1][1] = 5;
        System.our.println(x.length)
        
    }
}
''// first nested array of size 5 contains the addresses of the rest of the arrays
//the other arrays are of size 3 with value 0 in them
// an array of size 5 containing reference blocks of all the rest of the 3 nested arrays with value 0 is created
