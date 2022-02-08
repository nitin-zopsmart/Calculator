import java.util.*;


public class Calculator {
    public static void main(String args[]){
        System.out.println("Please Enter two numbers");
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Please enter your choice");
        int i=sc.nextInt();

        switch (i){
            case 1:
                System.out.println("Sum is :"+(a+b));
                break;
            case 2:
                System.out.println("Difference is "+(a-b));
                break;
            default:
                System.out.println("Please recheck files");
                break;
        }
    }
}
