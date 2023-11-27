
import java.util.Scanner; 

class Account{
    String  Name , pin;
    double bal=0;
   
    int Accno=9011;
    Scanner sc=new Scanner(System.in);

    public Account(){
        
    }
    
    public Account(String name,double bal){
            this.Name=name;
            this.bal=bal;
    }

    public void CreateAccount(){
         System.out.println("Enter your Details for create your account:-");
         System.out.print("Name= ");
          this.Name=sc.nextLine();
         System.out.print("Phone no.= ");
         String ph=sc.nextLine();
         System.out.print("Pin= ");
         pin=sc.nextLine();
         System.out.println("\nyour account created.\n");
         System.out.println("Name: "+Name +"\n"+"Acc no.:"+(Accno++)+"\nPhone no.: "+ph+"\n"+"PIN: "+pin+"\nBalance: "+bal);
    } 
    
    public void CheckBal(){
        String name;
        System.out.println("Enter name of the Account owner: ");
        
        name=sc.nextLine();
        
        if(name.equals(this.Name)){
            System.out.println("Balance: "+this.bal);
        }else{
            System.out.println("This account is not exit in the system ");
        }
        System.out.println();
    }
    
    public void WithDraw(){
        double amt;
        String name;
        System.out.println("enter some account details for withdrawing the ammount.\nName: ");
       
        name=sc.nextLine();
        if(name.equals(this.Name)){
        System.out.println("enter ammount for wothdrawing in your account");
        amt=sc.nextDouble();
        if(this.bal<amt){
            System.out.println("you have not sufficent Balance in your account \nso please make sure the ammout is equal or less than your balance\nPlease try again!");
        }else if(this.bal>=amt){
            this.bal=this.bal-amt;
            System.out.println("Successful!\nHAVE A GOOD DAY!");
        }
        }else{
            System.out.println("you enter wrong detail\nplease enter right detail\n");
        }
        
    }
    
    public void Deposit(){
        String name;
        double amt,bal;
        System.out.print("enter account detail like \nName:");
        
        name=sc.nextLine();
        if(name.equals(this.Name)){
            System.out.println("enter ammout you want to deposit in your account: ");
            amt=sc.nextDouble();
            this.bal=this.bal+amt;
            System.out.println("successful!\nHAVE A GOOD DAY!\n");
        }
    }
    
}

public class AtmInterface{
    public static void main(String[] args) {

        
        
        Account ac=new Account("Smith",777.54);
        
        
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter any options \n 1.Create Account \n 2.CheckingBalance \n 3.WithDraw(Amount) \n 4.Deposit(Amount) \n 5.Exit");
        
        int op=sc.nextInt();
        
        switch(op){
            case 1 -> ac.CreateAccount();
            case 2 -> ac.CheckBal();
            case 3 -> ac.WithDraw();
            case 4 -> ac.Deposit();
            case 5 -> System.exit(0);
        }
        }
    }
}
