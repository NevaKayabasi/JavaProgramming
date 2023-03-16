package day31_CustomClassConstructors;

public class BankAccount {

    public String accountHolder;
    public long  accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }



    public void checkBalance(){System.out.println("Your available balance is: "+ balance);}


    public void deposit(double amount){
        if(amount <= 0){
            System.out.println("Depositing amount can not be zero or negative");
            return; // exits the method
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance){
            System.out.println("Insufficient balance");
            return;
        }
        if(amount <= 0){ // if withdrawing amount is negative or zero
            System.out.println("Withdrawing amount can not be negative or zero");
            return;
        }
        balance -= amount;
    }

}
