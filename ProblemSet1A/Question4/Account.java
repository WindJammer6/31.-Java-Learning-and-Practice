// ATTENTION 
// just edit this file
// TestAccount.java contains the test cases provided in the problem set 
// Put in any import statements that you need 

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;


    //////////////////
    // Constructors //
    //////////////////
    // The no-arg Constructor
    // Extra note: There is 2 ways to define a class instance in the main code without any parameters
    // 1. Define a no-arg Constructor
    // 2. By default, if no Constructors is defined in the class, then class instances are automatically
    //    set to be defined without any parameters
    public Account(){
        System.out.println("Account No-Arg Constructor");
        this.id = 0;
        this.balance = 0.0;
        this.dateCreated = new Date();
    }

    // The 2-arg Constructor
    public Account(int id, double balance){
        System.out.println("Account 2-Arg Constructor");
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }


    /////////////////////////////
    // Accessor/getter methods //
    /////////////////////////////
    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }


    /////////////////////////////
    // Mutuator/setter methods //
    /////////////////////////////
    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    // In static/class methods, getters and setters, you cannot use non-static/instance variables!
    // Java will throw an error. You can only use static/class variables in them.
    public static void setAnnualInterestRate(double annualInterestRate){
        // For static/class variables, you don't use 'this.', but you need to call the name of the class
        // instead (which is 'Account.' in this case)
        Account.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(Date dateCreated){
        this.dateCreated = dateCreated;
    }


    //////////////////////
    // Instance Methods //
    //////////////////////
    public static double getMonthlyInterestRate(){
        return getAnnualInterestRate() / 12;
    }

    public double getMonthlyInterest(){
        return getBalance() * (getMonthlyInterestRate()/100);
    }

    public void withdraw(double withdrawalMoney){
        this.balance = this.balance - withdrawalMoney;
    }

    public void deposit(double depositMoney){
        this.balance = this.balance + depositMoney;
    }

}

// **HINT**
// The problem set says "assume all accounts have the same interest rate". 
// What does that tell you about the variable(s) and/or method(s) relating to the interest rate? 