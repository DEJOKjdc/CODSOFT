import java.util.Scanner; 
public class CODSOFTQ1 {
    
    public static void main(String[] args){
        System.out.println("Number Game");
        Scanner obj=new Scanner(System.in);
        int randomnumber=(int)(Math.random()*101+1);
        System.out.println("Guess the number in 10guess and get score.Enter the number");
        int x=9;
        int usernumber=obj.nextInt();
        while(randomnumber!=usernumber && x!=0){
            System.out.println("Try Again,Enter new number:");
            usernumber=obj.nextInt();
            x=x-1;
    }
    if(x==0){
        System.out.println("You didnt get correct Number");
        System.out.println("Your Score(out of 10):"+0);
    }
    else{
        System.out.println("Right.You got the correct Number");
        System.out.println("Your Score(out of 10):"+x);
    }
}
}