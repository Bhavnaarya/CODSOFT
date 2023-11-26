
import java.util.Scanner;

class Account{
    String accno , name , pin;
    long amount;
    Scanner sc=new Scanner(System.in);

    public Account(){
        System.out.println("hyy");
    }

    public void CreateAccount(){
         System.out.println("Enter your Details for create your account:-");
         System.out.print("Name: ");
         String Name=sc.nextLine();
         System.out.print("Phone no.: ");
         String ph=sc.nextLine();
         System.out.print("Pin: ");
         pin=sc.nextLine();
    } 
}

public class AtmInterface{
    public static void main(String[] args) {

        Account ac=new Account();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any options for \n 1.Create Account \n 2.CheckingBalance \n 3.WithDraw(Amount) \n 4.Deposit(Amount)");
        int op=sc.nextInt();
        switch(op){
            case 1:ac.CreateAccount(); 
        }
    }
}
