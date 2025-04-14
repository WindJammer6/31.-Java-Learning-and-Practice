// **ATTENTION**
// Edit just this file to submit your answer
// You need not edit the TestCheckingAccount.java file
// Leave the Account.class file alone
// If your class has problems accessing the Account.class,
// go to Actions -> Reset Assignment. Make sure you have your code stored on your computer.

import java.util.Date;

public class CheckingAccount extends Account{

    //////////////////
    // Constructors //
    //////////////////
    // The no-arg Constructor
    // Extra note: There is 2 ways to define a class instance in the main code without any parameters
    // 1. Define a no-arg Constructor
    // 2. By default, if no Constructors is defined in the class, then class instances are automatically
    //    set to be defined without any parameters
    public CheckingAccount(){
        // The 'super()' method needs to come as the first line in the Constructor
        super();
        System.out.println("Account No-Arg Constructor");
    }

    // The 2-arg Constructor
    public CheckingAccount(int id, double balance){
        // The 'super()' method needs to come as the first line in the Constructor
        super(id, balance);
        System.out.println("Account 2-Arg Constructor");
    }


    /////////////////////////////
    // Accessor/getter methods //
    /////////////////////////////
    // nil

    /////////////////////////////
    // Mutuator/setter methods //
    /////////////////////////////
    // nil

    //////////////////////
    // Instance Methods //
    //////////////////////
    @Override
    public void withdraw(double withdrawalMoney){
        if (getBalance() - withdrawalMoney < -5000){
            System.out.println("over limit");
        } else{
            setBalance(getBalance() - withdrawalMoney);
        }
    }
}
