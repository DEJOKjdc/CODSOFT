import java.util.Scanner; 
public class CODESOFTQ2 {
    public static void main(String[] args){
        System.out.println("Student Grade Calculator");
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter no.of subjects of the student:");
        int s=obj.nextInt();
        int totsum,i,k;
        totsum=0;
         System.out.println("Enter subjects marks of the student one by one:");
        for(i=0;i<s;i++){
            k=obj.nextInt();
            totsum+=k;
        }
        int avg=(int) totsum/s;
        System.out.println("Total marks="+totsum);
        System.out.println("Average percentage="+avg);
    if(avg>90 && avg<100){
        System.out.println("Your Grade is S");
    }else if(avg>80 && avg<90){
        System.out.println("Your Grade is A");
    }else if(avg>70 && avg<80){
        System.out.println("Your Grade is B");
    }else if(avg>60 && avg<70){
        System.out.println("Your Grade is C");
    }else if(avg>50 &&avg<60){
        System.out.println("Your Grade is D");
    }else if(avg>40 &&avg<50){
        System.out.println("Your Grade is E");
    }else if(avg<40){
        System.out.println("Your Grade is F");
    }
}
}
