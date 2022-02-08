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
            case 3:
                System.out.println("Product is :"+(a*b));
            case 4:
                System.out.println("Division is :"+(a/b));
            default:
                System.out.println("Please recheck files");
                break;
        }
    }
}
