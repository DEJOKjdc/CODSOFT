
import java.util.Scanner; 
public class CODESOFTQ3 {
    public static class User{
        static int x=10000;
    }
    class Atm {
         
        void withdraw(int amount) {
            
            if(User.x<amount){
                System.out.println("balance not sufficient,your balance:"+User.x);
                System.out.println("----------------------------------------------");
            }else{
                User.x=User.x-amount;
                System.out.println("withdraw successfull");
                System.out.println("----------------------------------------------");
            }
    
        }
      
        void deposit(int amount) {
            
                User.x=User.x+amount;
                System.out.println("deposit successfull");
                System.out.println("----------------------------------------------");
    
        }
        void checkbalance(){
            
            System.out.println("balance:"+User.x);
            System.out.println("----------------------------------------------");
        }
    }
    public static void main(String[] args){
        System.out.println("ATM");
        Scanner obj=new Scanner(System.in);

        
        CODESOFTQ3 main = new CODESOFTQ3();
        Atm k = main.new Atm();
        int f=0;
        while(f==0){
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check balance");
        System.out.println("any other number or character for exit!");
        int opt=obj.nextInt();
        switch(opt){
        case 1:
        System.out.println("Enter Ammout to Withdraw :");
        int w=obj.nextInt();
        k.withdraw(w);
        break;
        
        case 2:
        System.out.println("Enter Ammout to Deposit:");
        int d=obj.nextInt();
        k.deposit(d);
        break;

        case 3:
        k.checkbalance();
        break;

        default:
           f=1;
        }}
        }

   
}