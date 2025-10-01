class BankAccount{
    String accountholder;
    double balance;
    
    BankAccount(){
        accountholder = "Guest";
        balance = 0;
    }
    
    BankAccount(String accountholder, double balance){
        this.accountholder = accountholder;
        this.balance = balance;
    }
    
    void deposit(double amount){ //void cannot return statement
        balance = balance + amount
    }
    
}

class Main(){
    public static void main(String[] args){
        
        //object creation
        BankAccount b1 = new BankAccount();         // no arguments
        BankAccount b2 = new BankAccount("A", 101); // 2 arguments
        // the new consructor call asks JAVA the one to look for
        // () → find a constructor with no parameters.
        // ("X", "Y") → find a constructor with two parameters of type String
        b1.deposit(50);
    }
}

// content inside the parenthesis decides which constructor runs
// () default constructor
// pass values those with matching parenthesis
// no match error
