// a varible declared inside a method - local variable
// destroyed when the method ends
// cant be used outside it

class Example{
    void show(){
        int nu = 5;
        System.out.println(nu);
    }
    
    void display(){
        System.out.println(nu); //throws error as value doesnt exist here
    }
}
