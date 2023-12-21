import java.util.Scanner;

class Mybank{
    int balance;
    
    public Mybank(int initialA){
        this.balance=initialA;
    }
    public int balanceEnquiry(){
        return balance;
    }
    
    public void withdraw(int amount){
        if (amount > 0 && amount <= balance){
            System.out.println("Withdraw Scuccessfull...THANK YOU");
            balance-=amount;
            System.out.println("BALANCE AVAILABLE AFTER WITHDRAWAL IS  "+balance);
        } else {
            System.out.println(" SORRY TRANSACTION CANCELLED...INSUFFICIENT BALANCE!!!!");
        }
    }
    public void deposit(int amount){
        Scanner input=new Scanner(System.in);
        if (amount> 0){
            System.out.println("Deposit is successfull...THANK YOU:");

            balance+=amount;
            System.out.println("BALANCE AVAILABLE AFTER DEPOSIT IS :"+balance);
            }
            else {
            System.out.println("Invalid entry!. Please choose a number above 0 :");
            }
    }
}

class ATM{

    private Mybank account; 
    public ATM(Mybank account){
      this.account = account;
    
    }

      public void transaction(){
        int choice;
        Scanner input= new Scanner(System.in);
        do{
        System.out.println("Select Options");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. balance enquiry");
        System.out.println("4. Leave");
        System.out.println("enter the choice");
        choice= input.nextInt();
        

          switch (choice){
                case 1:
                    System.out.println("Enter amount to deposit");
                    int depositA = input.nextInt();
                    account.deposit(depositA);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw");
                    int withdrawA= input.nextInt();
                    account.withdraw(withdrawA);
                    break;
                case 3:
                    System.out.println("Current balance " + account.balanceEnquiry());
                    break;
                case 4:
                    System.out.println("Thanks for working with My Bank");
                    break;
                default:
                    System.out.println("Invalid entry!!");   
            }
        }while (choice!= 4);
        
    }
}
public class ATMk{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mybank userAccount = new Mybank(2500);
        ATM atm = new ATM(userAccount);
        System.out.println("***PIN***");
        int pin = input.nextInt();
        int X=2004;
        if(pin == X) {
        atm.transaction();
     }else {
            System.out.println("**invalid pin..Transaction cancelled**");
        }

     }
}